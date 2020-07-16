(require '[clojure.string :as s])

(s/trim "   *Look, no more spaces.*  ") ; <1>
;; "*Look, no more spaces.*"

(s/trim "\t1\t2n\n") ; <2>