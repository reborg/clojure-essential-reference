(require '[criterium.core :refer [quick-benchmark]])
(import '[java.util ArrayList LinkedList])

(defmacro b [expr]  ; <1>
  `(first (:mean (quick-benchmark ~expr {}))))

(let [c1 (range 1000) ; <2>
      c2 (map inc c1)
      c3 (ArrayList. c1)
      c4 (LinkedList. c1)]
      (for [t [c1 c2 c3 c4]]
        [(type t) (b (vec t))]))

;; ([clojure.lang.LongRange 1.0874153277485413E-5]
;;  [clojure.lang.LazySeq   2.0303272494887527E-5]
;;  [java.util.ArrayList    1.0039155519384434E-5]
;;  [java.util.LinkedList   1.4243774103139014E-5])