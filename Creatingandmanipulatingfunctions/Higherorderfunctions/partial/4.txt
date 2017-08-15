(defn as [x]
  (partial = x))                          ; <1>

(defn same? [item coll]
  (apply (as item) (seq coll)))           ; <2>

(def all-a? (partial same? \a))           ; <3>
(def all-red? (partial same? :red))       ; <4>

(all-a? "aaaaa")                          ; <5>
;; true
(all-red? [:red :red :red])               ; <6>
;; true