(def points-struct (doall (map #(apply struct w-struct %) lines)))
(def points-record (doall (map #(apply ->w-record %) lines)))
(def points-map    (doall (map #(apply w-map %) lines)))
(def points-hmap   (doall (map #(apply w-hmap %) lines)))

(def id (accessor w-struct :id))

(let [w (first points-struct)] (quick-bench (id  w))) ; <1>
;; Execution time mean : 4.318680 ns

(let [w (first points-struct)] (quick-bench (:id  w)))
;; Execution time mean : 10.249677 ns

(let [w (first points-record)] (quick-bench (:id w)))
;; Execution time mean : 4.626574 ns

(let [w (first points-map)] (quick-bench (:id w)))
;; Execution time mean : 9.730 ns

(let [w (first points-hmap)] (quick-bench (:id w)))
;; Execution time mean : 14.216794 ns

(let [^user.w-record w (first points-record)] (quick-bench (.id w))) ; <2>
;; Execution time mean : 3.612035 ns