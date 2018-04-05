(defn loc [resource]
  (let [f (clojure.java.io/resource resource)]              ; <1>
    (when f
      (count (clojure.string/split-lines (slurp f))))))     ; <2>

(defn total-loc [& files]                                   ; <3>
  (reduce + (keep loc files)))

(total-loc "non-existent" "clojure/core.clj" "clojure/pprint.clj")
;; 7570