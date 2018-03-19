(defn dbg-coll [n] ; <1>
  (let [xs (into () (range n 0 -1))]
    (map #(do (print % ", ") %) xs)))

(def a (iterator-seq (.iterator (dbg-coll 100)))) ; <2>
;; 1 , 2 , ... ,  32 , 33 , 1

(first (enumeration-seq (Collections/enumeration (dbg-coll 100)))) ; <3>
;; 1 , 1