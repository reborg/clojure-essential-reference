(require '[keirin.core :as k])

(defn- test-speed-creation-keirin' [i]
  (let [num-elements (* (inc i) 100000)
        data (doall (range num-elements))]
    [num-elements
     (k/bench (vec data) :num-timed-runs 120 :reporting :underlying-results)
     (k/bench (apply vector data) :num-timed-runs 120 :reporting :underlying-results)]))

(defn test-speed-creation-keirin []
  (let [results (for [i (range 10)] (test-speed-creation-keirin' i))]
    (doseq [i (range 3)]
      (doseq [result results]
        (let [num (cond-> (get result i)
                    (not= i 0)
                    :median)]
          (printf "%10.3f " (double num))))
      (println))))