(defn loc [resource]
  (when-let [f (clojure.java.io/resource resource)]     ; <1>
    (count (clojure.string/split-lines (slurp f)))))

(total-loc "non-existent" "clojure/core.clj" "clojure/pprint.clj")
;; 7570