(defn sum-of-squares [n]
  (->> (range n)      ; <1>
       (map #(* % %)) ; <2>
       (reduce +)))   ; <3>

(defn average-of-squares [n]
  (/ (sum-of-squares n) (double n)))

(average-of-squares 10)
;; 28.5