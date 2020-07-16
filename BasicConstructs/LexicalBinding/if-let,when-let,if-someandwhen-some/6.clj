(require '[clojure.java.io :as io])
(require '[clojure.string :as s])

(defn loc [resource]
  (let [f (io/resource resource)]              ; <1>
    (when f
      (count (s/split-lines (slurp f))))))     ; <2>

(defn total-loc [& files]                      ; <3>
  (reduce + (keep loc files)))

(total-loc "non-existent" "clojure/core.clj" "clojure/pprint.clj")
;; 7570