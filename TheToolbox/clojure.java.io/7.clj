(require '[clojure.java.io :refer [as-url file]])
(import 'java.nio.file.FileSystems)

(def path ; <1>
  (.. FileSystems
      getDefault
      (getPath "/tmp" (into-array String ["words"]))
      toUri))

(def u1 (as-url "file:///tmp/words")) ; <2>
(def u2 (as-url (file "/tmp/words"))) ; <3>
(def u3 (as-url path))                ; <4>

(= u1 u2 u3) ; <5>
;; true