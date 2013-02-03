(ns someotherproject.core)

(defn readNasFile [map]
  map)


(defn load-filelist
  "Load a list of files from the first example."
  [inputfilename]
  (with-open [r (java.io.PushbackReader. (java.io.FileReader. inputfilename))]
    (doall (take-while identity (repeatedly (fn [] (read r false nil)))))))

