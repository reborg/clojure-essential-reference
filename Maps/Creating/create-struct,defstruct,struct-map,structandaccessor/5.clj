(require '[clojure.string :refer [split-lines split]])

(def waypoints "https://tinyurl.com/station-locs") ; <1>
(def lines (-> waypoints slurp split-lines))

(def waypoints
  (let [sdef (create-struct :type :lat :lon :id)] ; <2>
    (transduce
      (comp
        (map #(split % #"\s+"))
        (map #(apply struct sdef %))) ; <3>
      conj
      lines)))

(first waypoints) ; <4>
;; {:type "VHF", :lat "0.000000", :lon "0.000000", :id "ABI"}