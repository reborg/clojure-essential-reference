(def colls [[1 2 3] {:a 1 :b 2} '(1 2 3)])
(def keys [-1 :z 0])
(def messages ["not found" "not found" "not supported"])

(map get colls keys messages)
;; ("not found" "not found" "not supported")