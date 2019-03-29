(def v (with-meta [1 2 3] {:initial-count 3})) ; <1>

(meta (conj v 3 4 5)) ; <2>
{:initial-count 3}

(meta (with-meta (with-meta [1 2 3] {:a 1}) {:a 2})) ; <3>
;; {:a 2}

(meta (into [] v)) ; <4>
;; nil

(with-meta (atom 0) {:not "supported"}) ; <5>
;; ClassCastException clojure.lang.Atom cannot be cast to clojure.lang.IObj