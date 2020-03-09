(def m (hash-map :y 0 :y 0 :d 0 :k 0 :w 0 :i 0
                 :f 0 :a 0 :n 0 :v 0 :s 0 :w 0)) ; <1>

(map-invert m) ; <2>
;; {0 :a}