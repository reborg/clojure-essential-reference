(require '[clojure.pprint :as p])

(p/write 20/3 :base 2 :radix true) ;; #b10100/11 ; <1>
(p/write (range 100) :length 3) ;; (0 1 2 ...) ; <2>
(p/write 'clojure.core/+ :suppress-namespaces true) ;; + ; <3>
(p/write (range 20) :right-margin 10) ; <4>