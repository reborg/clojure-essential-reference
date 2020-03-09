(def colls [[1 2 3] {:a 1 :b 2} '(1 2 3)])
(def ks [-1 :z 0])
(def messages ["not found" "not found" "not supported"])

(map get colls ks messages) ; <1>
;; ("not found" "not found" "not supported")