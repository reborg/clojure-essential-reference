(require '[clojure.repl :refer [source]])
(require '[clojure.string :as s])

(-> some?         ; <1>
    source        ; <2>
    with-out-str  ; <3>
    s/upper-case  ; <4>
    println)

;; (DEFN SOME? ; <5>
;;   "RETURNS TRUE IF X IS NOT NIL, FALSE OTHERWISE."
;;   {:TAG BOOLEAN
;;    :ADDED "1.6"
;;    :STATIC TRUE}
;;   [X] (NOT (NIL? X)))