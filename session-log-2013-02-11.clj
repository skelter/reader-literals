╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╭─skelter@charles-suehss-macbook-pro-2  ~  
╰─$ 
╭─skelter@charles-suehss-macbook-pro-2  ~  
╰─$ cd work/reader-literals/nastimer 
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹master*› 
╰─$ git status
# On branch master
# Changes not staged for commit:
#   (use "git add <file>..." to update what will be committed)
#   (use "git checkout -- <file>..." to discard changes in working directory)
#
#	modified:   ../someotherproject/src/someotherproject/core.clj
#
# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#
#	../repl-port
no changes added to commit (use "git add" and/or "git commit -a")
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹master*› 
╰─$ cd ..
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹master*› 
╰─$ ls
Presenter.html   myfilelist.txt   presentation.md  showdown.js
README.md        nastimer         repl-port        someotherproject
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹master*› 
╰─$ cat repl-port 
56805%                                                                                                                 ╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹master*› 
╰─$ git diff
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹master*› 
╰─$ git checkout -b Meetup-2013-02-04
M	someotherproject/src/someotherproject/core.clj
Switched to a new branch 'Meetup-2013-02-04'
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹Meetup-2013-02-04*› 
╰─$ git add someotherproject/src/someotherproject/core.clj
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹Meetup-2013-02-04*› 
╰─$ git commit -m "We tried, on a lark, to see what happens when we specify a macro as the reader function.  "
[Meetup-2013-02-04 271360d] We tried, on a lark, to see what happens when we specify a macro as the reader function.
 1 files changed, 3 insertions(+), 3 deletions(-)
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹Meetup-2013-02-04*› 
╰─$ ls
Presenter.html   myfilelist.txt   presentation.md  showdown.js
README.md        nastimer         repl-port        someotherproject
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals  ‹Meetup-2013-02-04*› 
╰─$ cd nastimer 
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein -Dcom.sun.management.jmxremote repl
'-Dcom.sun.management.jmxremote' is not a task. See 'lein help'.
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein repl -Dcom.sun.management.jmxremote                                                                       1 ↵
Unrecognized flag: -Dcom.sun.management.jmxremote
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein help                                                                                                      1 ↵
Leiningen is a tool for working with Clojure projects.

Several tasks are available:
check               Check syntax and warn on reflection.
classpath           Write the classpath of the current project to output-file.
clean               Remove all files from project's target-path.
compile             Compile Clojure source into .class files.
deploy              Build jar and deploy to remote repository.
deps                Show details about dependencies.
do                  Higher-order task to perform other tasks in succession.
help                Display a list of tasks or help for a given task.
install             Install current project to the local repository.
jar                 Package up all the project's files into a jar file.
javac               Compile Java source files.
light               Start a Light Table client for this project
new                 Generate project scaffolding based on a template.
plugin              DEPRECATED. Please use the :user profile instead.
pom                 Write a pom.xml file to disk for Maven interoperability.
repl                Start a repl session either with the current project or standalone.
retest              Run only the test namespaces which failed last time around.
run                 Run the project's -main function.
search              Search remote maven repositories for matching jars.
show-profiles       List all available profiles or display one if given an argument.
test                Run the project's tests.
trampoline          Run a task without nesting the project's JVM inside Leiningen's.
uberjar             Package up the project files and all dependencies into a jar file.
upgrade             Upgrade Leiningen to specified version or latest stable.
version             Print version for Leiningen and the current JVM.
with-profile        Apply the given task with the profile(s) specified.

Run lein help $TASK for details.

Aliases:

See also: readme, faq, tutorial, news, sample, profiles,
deploying and copying.
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein repl help
Unrecognized flag: help
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein repl --help                                                                                               1 ↵
Start a repl session either with the current project or standalone.

USAGE: lein repl
This will launch an nREPL server behind the scenes
that reply will connect to. If a :port key is present in
the :repl-options map in project.clj, that port will be used for the
server, otherwise it is chosen randomly. If you run this command
inside of a project, it will be run in the context of that classpath.
If the command is run outside of a project, it'll be standalone and
the classpath will be that of Leiningen.

USAGE: lein repl :headless
This will launch an nREPL server and wait, rather than connecting reply to it.

USAGE: lein repl :connect [host:]port
Connects to the nREPL server running at the given host (defaults to localhost)
and port.

Arguments: ([] [] [flag & opts])
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein repl       
nREPL server started on port 62420
REPL-y 0.1.0-beta10
Clojure 1.4.0
    Exit: Control+D or (exit) or (quit)
Commands: (user/help)
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
          (user/sourcery function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
Examples from clojuredocs.org: [clojuredocs or cdoc]
          (user/clojuredocs name-here)
          (user/clojuredocs "ns-here" "name-here")
user=> ^CBye for now!

╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein repl
nREPL server started on port 62489
REPL-y 0.1.0-beta10
Clojure 1.4.0
    Exit: Control+D or (exit) or (quit)
Commands: (user/help)
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
          (user/sourcery function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
Examples from clojuredocs.org: [clojuredocs or cdoc]
          (user/clojuredocs name-here)
          (user/clojuredocs "ns-here" "name-here")
user=> (def lotsofiles (file-seq (java.io.File. "/Users/skelter")))
#'user/lotsofiles
user=> (count lotsofiles)
^CException in thread "RMI TCP Connection(idle)" Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
java.lang.OutOfMemoryError: GC overhead limit exceeded
	at java.io.BufferedInputStream.<init>(BufferedInputStream.java:195)
	at java.io.BufferedInputStream.<init>(BufferedInputStream.java:175)
	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:697)

Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "RMI TCP Connection(idle)"
Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: Java heap space
Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
^CException in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
Exception in thread "nREPL-worker-1" java.lang.OutOfMemoryError: GC overhead limit exceeded
Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
^C^C^C^C^C^C^C^C^C^C^CException in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: GC overhead limit exceeded
Exception in thread "RMI TCP Connection(idle)" java.lang.OutOfMemoryError: Java heap space

[1]  + 42230 suspended  lein repl
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ kill %1                                                                                                       18 ↵
Welcome back!                                                                                                          
[1]  + 42230 terminated  lein repl
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ 


Exception in thread "SIGCONT handler" 
╭─skelter@charles-suehss-macbook-pro-2  ~/work/reader-literals/nastimer  ‹Meetup-2013-02-04*› 
╰─$ lein repl 
nREPL server started on port 62681
REPL-y 0.1.0-beta10
Clojure 1.4.0
    Exit: Control+D or (exit) or (quit)
Commands: (user/help)
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
          (user/sourcery function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
Examples from clojuredocs.org: [clojuredocs or cdoc]
          (user/clojuredocs name-here)
          (user/clojuredocs "ns-here" "name-here")
user=> (def lotsofiles (file-seq (java.io.File. "/home/Users/skelter/work")))
#'user/lotsofiles
user=> (count lotsofiles)
1
user=> (def lotsofiles (file-seq (java.io.File. "/Users/skelter/work")))
#'user/lotsofiles
user=> (count lotsofiles)
66862
user=> (take 10 lotsofiles)
(#<File /Users/skelter/work> #<File /Users/skelter/work/.DS_Store> #<File /Users/skelter/work/batik> #<File /Users/skelter/work/batik/batik-1.7> #<File /Users/skelter/work/batik/batik-1.7/build.bat> #<File /Users/skelter/work/batik/batik-1.7/build.sh> #<File /Users/skelter/work/batik/batik-1.7/build.xml> #<File /Users/skelter/work/batik/batik-1.7/CHANGES> #<File /Users/skelter/work/batik/batik-1.7/contrib> #<File /Users/skelter/work/batik/batik-1.7/contrib/charts>)
user=> (spit "files.txt" lotsofiles)
nil
user=> (spit "files.txt" lotsofiles)
nil
user=> (count lotsofiles)
66862
user=> (spit "files.txt" (file-seq (file "/Users/skelter")))
CompilerException java.lang.RuntimeException: Unable to resolve symbol: file in this context, compiling:(NO_SOURCE_PATH:1) 

user=> (spit "files.txt" (file-seq (java.io.File. "/Users/skelter")))
^C
user=> (dir user)
cdoc
clojuredocs
defn
help
lotsofiles
set-signal-handler!
sourcery
user.proxy$java.lang.Object$SignalHandler$7826cc2
nil
user=> (spit "files.txt" (take 1000 lotsofiles))
nil
user=> (spit "files.txt" (take 100000 lotsofiles))
nil
user=> (spit "files.txt" (take 100000 (map pr-str lotsofiles)))
nil
user=> (spit "files.txt" (str (take 100000 (map pr-str lotsofiles)) "\n" )
  #_=> )
nil
user=> (spit "files.txt" (str (take 100000 (map pr-str lotsofiles)) "\n" ))
nil
user=> (spit "files.txt" (str (take 1000000 (map pr-str lotsofiles)) "\n" ))
nil
user=> (spit "files.txt" (str (take 1000000 (map pr-str lotsofiles)) "\n" ))
nil
user=> (class lotsofiles)
clojure.lang.LazySeq
user=> (first lotsofiles)
#<File /Users/skelter/work>
user=> (take 10 (map pr-str lotsofiles))
("#<File /Users/skelter/work>" "#<File /Users/skelter/work/.DS_Store>" "#<File /Users/skelter/work/batik>" "#<File /Users/skelter/work/batik/batik-1.7>" "#<File /Users/skelter/work/batik/batik-1.7/build.bat>" "#<File /Users/skelter/work/batik/batik-1.7/build.sh>" "#<File /Users/skelter/work/batik/batik-1.7/build.xml>" "#<File /Users/skelter/work/batik/batik-1.7/CHANGES>" "#<File /Users/skelter/work/batik/batik-1.7/contrib>" "#<File /Users/skelter/work/batik/batik-1.7/contrib/charts>")
user=> (doc spit)
-------------------------
clojure.core/spit
([f content & options])
  Opposite of slurp.  Opens f with writer, writes content, then
  closes f. Options passed to clojure.java.io/writer.
nil
user=> (spit "files.txt" (str (take 1000000 (map pr-str lotsofiles)) "\n" ))
nil
user=> (count (take 1000000 lotsofiles))
66862
user=> (def nasfiles (file-seq (java.io.File. "/Volumes/family")))
#'user/nasfiles
user=> (count (take 1000000 nasfiles))
1
user=> (count (take 1000000 nasfiles))
1
user=> (def nasfiles (file-seq (java.io.File. "/Volumes/family")))
#'user/nasfiles
user=> (count (take 1000000 nasfiles))
293615
user=> (doc writer)
nil
user=> (count (take 1000000 nasfiles))
293615
user=> (count nasfiles)
293615
user=> (count (filter #(not (.isDirectory %)) nasfiles))
^C
user=> (def nasfilemaps (map #( {:name (.getPath %) :directory (.isDirectory %) :size (.length %) }) nasfiles))
#'user/nasfilemaps
user=> (take 10 nasfilemaps)
ArityException Wrong number of args (0) passed to: PersistentArrayMap  clojure.lang.AFn.throwArity (AFn.java:437)

user=> (.getPath (first (nasfiles))
  #_=> )
ClassCastException clojure.lang.LazySeq cannot be cast to clojure.lang.IFn  user/eval1017 (NO_SOURCE_FILE:1)

user=> (.getPath (first nasfiles))
"/Volumes/family"
user=> (bean (first nasfiles))
{:path "/Volumes/family", :parent "/Volumes", :hidden false, :parentFile #<File /Volumes>, :canonicalFile #<File /Volumes/family>, :freeSpace 69904703488, :absoluteFile #<File /Volumes/family>, :class java.io.File, :name "family", :absolutePath "/Volumes/family", :directory true, :usableSpace 69904703488, :canonicalPath "/Volumes/family", :absolute true, :totalSpace 499600785408, :file false}
user=> (dir user)
cdoc
clojuredocs
defn
help
lotsofiles
nasfilemaps
nasfiles
set-signal-handler!
sourcery
user.proxy$java.lang.Object$SignalHandler$7826cc2
nil
user=> (count (take 100 (nasfilemaps)))
ClassCastException clojure.lang.LazySeq cannot be cast to clojure.lang.IFn  user/eval1033 (NO_SOURCE_FILE:1)

user=> (count (take 100 nasfilemaps))
0
user=> (require 'clojure.java.data)
FileNotFoundException Could not locate clojure/java/data__init.class or clojure/java/data.clj on classpath:   clojure.lang.RT.load (RT.java:432)

user=> (def extractor #( {:name (.getPath %) }))
#'user/extractor
user=> (doc extractor)
-------------------------
user/extractor
  nil
nil
user=> (extractor (first nasfile))
CompilerException java.lang.RuntimeException: Unable to resolve symbol: nasfile in this context, compiling:(NO_SOURCE_PATH:1) 

user=> (extractor (first nasfiles))
ArityException Wrong number of args (0) passed to: PersistentArrayMap  clojure.lang.AFn.throwArity (AFn.java:437)

user=> {:name "name"}
{:name "name"}
user=> (def extractor #( {:name "argh" }))
#'user/extractor
user=> (extractor (first nasfiles))
ArityException Wrong number of args (1) passed to: user$extractor  clojure.lang.AFn.throwArity (AFn.java:437)

user=> (defn extractor [file] { :name (.getPath file)  :directory (.isDirectory file) :size (.length file) } )
#'user/extractor
user=> (extractor (first nasfiles))
{:name "/Volumes/family", :directory true, :size 16384}
user=> (def nasfilemaps (map extractor nasfiles))
#'user/nasfilemaps
user=> (take 10 nasfilemaps)
({:name "/Volumes/family", :directory true, :size 16384} {:name "/Volumes/family/Addresses", :directory true, :size 16384} {:name "/Volumes/family/Addresses/WilliamByrd.txt", :directory false, :size 158} {:name "/Volumes/family/Archives", :directory true, :size 16384} {:name "/Volumes/family/Archives/Addresses", :directory true, :size 16384} {:name "/Volumes/family/Archives/Addresses/backup.pst", :directory false, :size 737280} {:name "/Volumes/family/Archives/Addresses/outlook.csv", :directory false, :size 93761} {:name "/Volumes/family/Archives/Addresses/outlook.csv.Manager", :directory false, :size 74} {:name "/Volumes/family/Archives/Addresses/outlook.csv.ldif", :directory false, :size 114271} {:name "/Volumes/family/Archives/Addresses/outlook.csv.ldif.tree", :directory false, :size 1757})
user=> (doc ns-unmap)
-------------------------
clojure.core/ns-unmap
([ns sym])
  Removes the mappings for the symbol from the namespace.
nil
user=> (doc sym)
nil
user=> (ns-unmap (find-ns 'user) nasfiles)
ClassCastException clojure.lang.LazySeq cannot be cast to clojure.lang.Symbol  clojure.core/ns-unmap (core.clj:3712)

user=> (ns-unmap (find-ns user) 'nasfiles)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: user in this context, compiling:(NO_SOURCE_PATH:1) 

user=> (ns-unmap (find-ns 'user) 'nasfiles)
nil
user=> (dir user)
cdoc
clojuredocs
defn
extractor
help
lotsofiles
nasfilemaps
set-signal-handler!
sourcery
user.proxy$java.lang.Object$SignalHandler$7826cc2
nil
user=> (ns-unmap (find-ns 'user) 'nasfilesmaps)
nil
user=> (ns-unmap (find-ns 'user) 'lotsofiles)
nil
user=> (dir user)
cdoc
clojuredocs
defn
extractor
help
nasfilemaps
set-signal-handler!
sourcery
user.proxy$java.lang.Object$SignalHandler$7826cc2
nil
user=> (ns-unmap (find-ns 'user) 'nasfilemaps)
nil
user=> (defn get-nasfiles [] (file-seq (java.io.File. "/Volumes/family")))
#'user/get-nasfiles
user=> (take 10 (map extractor (get-nasfiles)))
({:name "/Volumes/family", :directory true, :size 16384} {:name "/Volumes/family/Addresses", :directory true, :size 16384} {:name "/Volumes/family/Addresses/WilliamByrd.txt", :directory false, :size 158} {:name "/Volumes/family/Archives", :directory true, :size 16384} {:name "/Volumes/family/Archives/Addresses", :directory true, :size 16384} {:name "/Volumes/family/Archives/Addresses/backup.pst", :directory false, :size 737280} {:name "/Volumes/family/Archives/Addresses/outlook.csv", :directory false, :size 93761} {:name "/Volumes/family/Archives/Addresses/outlook.csv.Manager", :directory false, :size 74} {:name "/Volumes/family/Archives/Addresses/outlook.csv.ldif", :directory false, :size 114271} {:name "/Volumes/family/Archives/Addresses/outlook.csv.ldif.tree", :directory false, :size 1757})
user=> (time (count (take 10 (map extractor (get-nasfiles)))))
"Elapsed time: 2037.337 msecs"
10
user=> (time (count (take 100 (map extractor (get-nasfiles)))))
"Elapsed time: 3066.838 msecs"
100
user=> (time (count (take 1000 (map extractor (get-nasfiles)))))
"Elapsed time: 233693.724 msecs"
1000
user=> (defn as-maps [files] (map extractor files))
#'user/as-maps
user=> (require 'java.io)
FileNotFoundException Could not locate java/io__init.class or java/io.clj on classpath:   clojure.lang.RT.load (RT.java:432)

user=> (require 'clojure.io)
FileNotFoundException Could not locate clojure/io__init.class or clojure/io.clj on classpath:   clojure.lang.RT.load (RT.java:432)

user=> (require 'clojure.java.io)
nil
user=> (with-open [outstream (make-output-stream "files.txt"]
#<RuntimeException java.lang.RuntimeException: Unmatched delimiter: ]>

user=> (with-open [outstream (make-output-stream "files.txt")]
  #_=>   (pr outstream "mine"))
RuntimeException Unmatched delimiter: ]  clojure.lang.Util.runtimeException (Util.java:170)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: make-output-stream in this context, compiling:(NO_SOURCE_PATH:2) 

user=> (with-open [outstream (clojure.java.io/make-output-stream "files.txt")] (pr outstream "mine"))
CompilerException java.lang.IllegalArgumentException: No single method: make_output_stream of interface: clojure.java.io.IOFactory found for function: make-output-stream of protocol: IOFactory, compiling:(NO_SOURCE_PATH:1) 

user=> (doc doseq)
-------------------------
clojure.core/doseq
([seq-exprs & body])
Macro
  Repeatedly executes body (presumably for side-effects) with
  bindings and filtering as provided by "for".  Does not retain
  the head of the sequence. Returns nil.
nil
user=> (with-open [outstream (clojure.java.io/make-output-stream (file "files.txt"))] (pr outstream "mine"))
CompilerException java.lang.RuntimeException: Unable to resolve symbol: file in this context, compiling:(NO_SOURCE_PATH:1) 

user=> (with-open [outstream (clojure.java.io/make-output-stream (clojure.java.io/file "files.txt"))] (pr outstream "mine"))
CompilerException java.lang.IllegalArgumentException: No single method: make_output_stream of interface: clojure.java.io.IOFactory found for function: make-output-stream of protocol: IOFactory, compiling:(NO_SOURCE_PATH:1) 

user=> (with-open [outstream (clojure.java.io/output-stream (clojure.java.io/file "files.txt"))] (pr outstream "mine"))
#<BufferedOutputStream java.io.BufferedOutputStream@41449750> "mine"nil
user=> (doc pr)
-------------------------
clojure.core/pr
([] [x] [x & more])
  Prints the object(s) to the output stream that is the current value
  of *out*.  Prints the object(s), separated by spaces if there is
  more than one.  By default, pr and prn print in a way that objects
  can be read by the reader
nil
user=> (with-open [outstream (clojure.java.io/output-stream (clojure.java.io/file "files.txt"))] (binding [*out* outstream ] (pr "mine")))
ClassCastException java.io.BufferedOutputStream cannot be cast to java.io.Writer  clojure.core/fn--5284 (core_print.clj:178)

user=> (with-open [outstream (clojure.java.io/writer (clojure.java.io/file "files.txt"))] (binding [*out* outstream ] (pr "mine")))
nil
user=> (with-open [outstream (clojure.java.io/writer (clojure.java.io/file "files.txt"))] (binding [*out* outstream ] (doseq [fm (as-maps (get-nasfiles))] (prn fm))))

