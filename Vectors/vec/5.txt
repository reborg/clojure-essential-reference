(require '[criterium.core :refer [quick-benchmark]]) ; <1>
(import '[java.util ArrayList LinkedList])

(defmacro b [expr] `(first (:mean (quick-benchmark ~expr {})))) ; <2>

(let [c1 (range 1000) ; <3>
      c2 (map inc c1)
      c3 (ArrayList. c1)
      c4 (LinkedList. c1)]
      (for [t [c1 c2 c3 c4]]
        [(type t) (b (vec t))]))

;; ([#<Class@2966123f clojure.lang.LongRange> 1.4480791079474646E-5]
;;  [#<Class@1f97cf0d clojure.lang.LazySeq>   2.3406594077042973E-5]
;;  [#<Class@5e1569af java.util.ArrayList>    1.1199960205728875E-5]
;;  [#<Class@3253d771 java.util.LinkedList>   1.859095685005394E-5])
