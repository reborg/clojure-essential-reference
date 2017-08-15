(require '[criterium.core :refer [quick-bench]])

(let [reducible (doall (range 1000))
      lazy (doall (map inc (range 1000)))]
   (quick-bench (vec lazy))
   (quick-bench (apply vector lazy))
   (quick-bench (vec reducible))
   (quick-bench (apply vector reducible)))

;; Execution time mean : 22.523189 µs ; <1>
;; Execution time mean : 22.624104 µs
;; Execution time mean : 16.058917 µs ; <2>
;; Execution time mean : 19.471246 µs