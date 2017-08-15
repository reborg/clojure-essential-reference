(contains? {:a "a" :b "b"} :b) ; <1>
;; true

(contains? #{:x :y :z} :z) ; <2>
;; true

(contains? [:a :b :c] 1) ; <3>
;; true