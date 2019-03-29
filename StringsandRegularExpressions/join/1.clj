(require '[clojure.string :refer [join]]) ; <1>

(join (list "Should " "this " "be " 1 \space 'sentence?))
;; "Should this be 1 sentence?" ; <2>