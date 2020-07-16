(deftype Counter [^:unsynchronized-mutable cnt] ; <1>
  clojure.lang.IFn
  (invoke [this] (set! cnt (inc cnt)))) ; <2>

(def counter (->Counter 0)) ; <3>

(counter)
;; 1

(counter)
;; 2