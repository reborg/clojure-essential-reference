(require '[clojure.data :refer [diff]]) ; <1>

(diff {:a "1" :b "2"} {:b "2" :c "4"}) ; <2>

;; ({:a "1"}  ; <3>
;; {:c "4"}   ; <4>
;; {:b "2"})  ; <5>