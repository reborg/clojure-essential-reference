(defn mapcat* [f & colls]
  (letfn [(step [colls]
            (lazy-seq
              (when-first [c colls]
                (concat c (step (rest colls))))))]
    (step (apply map f colls)))) ; <1>

(def a (mapcat* range (map #(do (print ".") %) (into () (range 10))))) ; <2>