(do
  (println "hello") ; <1>
  (+ 1 1))
;; hello
;; 2

(if (some even? [1 2 3])
  (do
    (println "found some even number") ; <2>
    (apply + [1 2 3]))
  (println "there was no even number."))
;; found some even number
;; 6