(import '[java.io File])

(definterface Concatenable ; <1>
  (^java.io.File concat [^java.io.File f])) ; <2>

(defn cfile [fname]
  (proxy [File Concatenable] [^String fname] ; <3>
    (concat [^File f] ; <4>
      (spit (.getPath f) (slurp this) :append true)
      f)))

(def ^Concatenable etchosts (cfile "/etc/hosts")) ; <5>
(def ^Concatenable f2 (cfile "temp2.txt"))

(spit f2 "# need to create this file\n") ; <6>

(.concat etchosts f2) ; <7>