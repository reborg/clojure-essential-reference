(defn loc [resource]
  (if-let [f (clojure.java.io/resource resource)]           ; <1>
    (count (clojure.string/split-lines (slurp f)))
    0))                                                     ; <2>

(defn total-loc [& files]
  (reduce + (map loc files)))                               ; <3>

(total-loc "non-existent" "clojure/core.clj" "clojure/pprint.clj")
;; 7570