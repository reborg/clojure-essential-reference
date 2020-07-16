(defn loc [resource]
  (when-let [f (io/resource resource)]     ; <1>
    (count (s/split-lines (slurp f)))))

(total-loc "non-existent" "clojure/core.clj" "clojure/pprint.clj")
;; 7570