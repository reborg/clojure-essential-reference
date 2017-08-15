(def coll [1 2 3])

(when-let [c (not-empty coll)] (pop c)) ; <1>
;; [1 2]

(when-let [c (seq coll)] (pop c)) ; <2>
;; ClassCastException