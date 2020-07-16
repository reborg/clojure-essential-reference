(find {:a 1 :b 2} :b) ; <1>
;; [:b 2]

(type (find {:a 1 :b 2} :b)) ; <2>
;; clojure.lang.MapEntry