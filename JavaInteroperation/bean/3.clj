(require '[criterium.core :refer [quick-bench]])
(import 'java.awt.Point)

(let [p (Point. 2 4)]
  (quick-bench
    {:class java.awt.Point
     :location (.getLocation p)
     :x (.getX p)
     :y (.getY p)}))

;; Execution time mean : 16.101893 ns

(let [p (Point. 2 4)]
  (quick-bench (bean p)))

;; Execution time mean : 1.229609 µs