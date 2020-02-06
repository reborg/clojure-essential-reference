(defn rev [coll] (into () coll)) ; <1>

(rev (range 10)) ; <2>
;; (9 8 7 6 5 4 3 2 1 0)