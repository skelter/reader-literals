(ns nastimer.core)

(defrecord NasFile [path size moddate])

(defn directory? [file]
  (.isDirectory file))

(defn normal? [file]
  (not (.isDirectory file)))

(defn nasfile [file]
     (NasFile. (.getPath file) (.length file) (java.util.Date. (.lastModified file))))

(defn build-nasfiles
  "Return a sequence of NasFiles from a given directory, expecting a java.io.File ."
  [filedir]
  (map nasfile (filter normal? (.listFiles filedir))))

(defn save-nasfiles
  "Save a list of nasfiles to a text file."
  [nasfiles outputfile]
  (binding [*out* (java.io.FileWriter. outputfile)]
    (doall
     (for [nf nasfiles]
      (prn nf)))))

(defn load-nasfiles
  "Load a list of nasfiles from a text file. Not Lazy, reads them all"
  [inputfilename]
  (with-open [r (java.io.PushbackReader. (java.io.FileReader. inputfilename))]
    (doall (take-while identity (repeatedly (fn [] (read r false nil)))))))

(defn save-nasfiles-interop
  "Save a list of nasfiles to a text file."
  [nasfiles outputfile]
  (binding [*out* (java.io.FileWriter. outputfile)]
    (doall
     (for [nf nasfiles]
       (do (print "#nasfile/file")
	   (prn { :path (:path nf) :size  (:size nf) :moddate (:moddate nf) }) )))))

       
(defn scan
  "Returns a sequence of NasFiles as read from rootToScan."
  [rootToScan]
  (let [root (java.io.File. rootToScan)]
    (conj (buid-nasfiles root) (map build-nasfiles (subfolders root)))
