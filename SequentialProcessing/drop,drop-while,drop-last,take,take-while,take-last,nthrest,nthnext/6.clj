(defn xs [] (map #(do (print ".") %) (iterate inc 0))) ; <1>

(def take-test (take 1e7 (xs))) ; <2>
;; #'user/take-test

(def time-bomb (drop 1e7 (xs))) ; <3>
#'user/time-bomb