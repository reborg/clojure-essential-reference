(require '[clojure.set :refer [map-invert]])

(def push conj)
(def brackets {\[ \] \( \) \{ \}})

(defn check [form stack] ; <1>
  (reduce (fn [q x]
    (cond
      (brackets x) (push q x)
      ((map-invert brackets) x)
      (if (= (brackets (peek q)) x)
        (pop q)
        (throw
          (ex-info
            (str "Unmatched delimiter " x) {})))
      :else q)) stack form))

(check "(let [a (inc 1]) (+ a 2))" ())
;; ExceptionInfo Unmatched delimiter ]

(check "(let [a (inc 1)] (+ a 2))" ())
;;()