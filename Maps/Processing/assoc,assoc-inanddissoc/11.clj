(let [m {:a [0 1 2 {:d 4 :e [0 1 2]}]}] ; <1>
  (dissoc-in m [:a 3 :e 0]))
;; ClassCastException clojure.lang.PersistentVector
;; cannot be cast to clojure.lang.IPersistentMap