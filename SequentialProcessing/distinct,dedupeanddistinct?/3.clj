(def votes [                    ; <1>
  {:id 14637 :vote 3 :secs 5}
  {:id 39212 :vote 4 :secs 9}
  {:id 39212 :vote 4 :secs 9}
  {:id 14637 :vote 2 :secs 43}
  {:id 39212 :vote 4 :secs 121}
  {:id 39212 :vote 4 :secs 121}
  {:id 45678 :vote 1 :secs 19}])

(->> votes          ; <2>
  (group-by :id)
  (reduce-kv
    (fn [m user votes]
      (assoc m user (distinct (map :vote votes))))
    {}))

;; {14637 (3 2), 39212 (4), 45678 (1)}