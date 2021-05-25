(set! *warn-on-reflection* true) ; <1>
;; true

(defn exists? [file] ; <2>
  (.exists file))
;; Reflection warning - reference to field exists can't be resolved.

(import '[java.io File])

(defn exists? [^File file] ; <3>
  (.exists file))