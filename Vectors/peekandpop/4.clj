(require '[clojure.set :refer [map-invert]])

(defn queue [] []) ; <1>
(def push conj) ; <2>
(def brackets {\[ \] \( \) \{ \}}) ; <3>

(defn check [form] ; <4>
  (reduce
    (fn [q x]
      (cond
        (brackets x)
        (push q x)  ; <5>
        ((map-invert brackets) x) ; <6>
        (if (= (brackets (peek q)) x)
          (pop q)
          (throw
            (ex-info
              (str "Unmatched delimiter " x) {})))
        :else q))
    (queue) form)) ; <7>

(check "(let [a (inc 1]) (+ a 2))")
;; ExceptionInfo Unmatched delimiter ]

(check "(let [a (inc 1)] (+ a 2))")
;; []