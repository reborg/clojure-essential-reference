(require '[clojure.java.io :refer [reader writer]])
(require '[clojure.string :refer [upper-case]])

(with-open [r (reader "/usr/share/dict/words") ; <1>
            w (writer "/tmp/words")]
  (doseq [line (line-seq r)] ; <2>
    (.append w (str (upper-case line) "\n")))) ; <3>
;; nil