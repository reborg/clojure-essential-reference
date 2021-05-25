(require '[clojure.pprint :as pprint])

pprint/*print-right-margin* ; <1>
;; 72

(defn words [n] (take n (repeat 'clojure))) ; <2>

(defn print-with-length [s] ; <3>
  (pprint/pprint s)
  (count (with-out-str (pprint/pprint s))))

(print-with-length (words 8)) ; <4>
;; (clojure clojure clojure clojure clojure clojure clojure clojure)
;; 66