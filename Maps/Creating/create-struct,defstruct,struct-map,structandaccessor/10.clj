(require '[clojure.java.io :refer [reader]])
(require '[clojure.string :refer [split-lines split]])
(require '[criterium.core :refer [quick-bench]])

(def waypoints "https://ral.ucar.edu/maps/Station.loc")
(def lines (->> waypoints slurp split-lines (map #(split % #"\s+"))))
(last lines)
;; ["ARP" "44.244823" "-84.179802" "Y31"] ; <1>

(defstruct w-struct :type :lat :lon :id) ; <2>
(defrecord w-record [type lat lon id])
(defn w-map [type lat lon id] {:type type :lat lat :lon lon :id id})
(defn w-hmap [type lat lon id] (hash-map :type type :lat lat :lon lon :id id))

(quick-bench (doall (map #(apply struct w-struct %) lines))) ; <3>
;; Execution time mean : 8.602227  ms
(quick-bench (doall (map #(apply ->w-record %) lines)))
;; Execution time mean : 6.172892  ms
(quick-bench (doall (map #(apply w-map %) lines)))
;; Execution time mean : 7.157129  ms
(quick-bench (doall (map #(apply w-hmap %) lines)))
;; Execution time mean : 20.554723 ms