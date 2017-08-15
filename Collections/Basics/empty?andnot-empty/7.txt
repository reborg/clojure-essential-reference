(empty? (map #(do (println "realizing" %) %) (range 100))) ; <1>
;; realizing 0
;; realizing 1
;; [..]
;; realizing 31
;; false

(zero? (count (map #(do (println "realizing" %) %) (range 100)))) ; <2>
;; realizing 0
;; realizing 1
;; [..]
;; realizing 99
;; false