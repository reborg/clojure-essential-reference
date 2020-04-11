(require '[criterium.core :refer [benchmark]])

(defmacro b [expr] ; <1>
  `(first (:mean (benchmark ~expr {}))))

(def results ; <2>
  (doall
    (for [i (range 10)]
      (let [num-elements (* (inc i) 100000)
            data (range num-elements)]
        [(b (vec data))
         (b (apply vector data))]))))