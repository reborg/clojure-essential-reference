(require '[clojure.string :as s]) ; <1>

(s/trim "   *Look, no more spaces.*  ") ; <2>
;; "*Look, no more spaces.*"

(s/trim "\t1\t2n\n") ; <3>