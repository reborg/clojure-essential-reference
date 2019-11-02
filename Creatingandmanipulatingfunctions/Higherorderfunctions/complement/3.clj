((complement {:a 1 :b 2}) :c) ; <1>
;; true

((complement {:a 1 :b nil}) :b) ; <2>
;; true