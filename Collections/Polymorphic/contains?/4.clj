(def m {:a 1 :b nil :c 3}) ; <1>

(if (get m :b) "Key found" "Key not found") ; <2>
;; Key not found

(if (contains? m :b) "Key found" "Key not found") ; <3>
;; Key found

(if-not (= ::none (get m :b ::none)) "Key found" "Key not found") ; <4>
;; Key found