(defn loc [resource]
  (if-let [f (io/resource resource)]    ; <1>
    (count (s/split-lines (slurp f)))
    0))                                 ; <2>

(defn total-loc [& files]
  (reduce + (map loc files)))           ; <3>

(total-loc "non-existent" "clojure/core.clj" "clojure/pprint.clj")
;; 7570