(var clojure.core/+) ; <1>
;; #'clojure.core/+

#'clojure.core/+ ; <2>
;; #'clojure.core/+

(identical? (var clojure.core/+) #'clojure.core/+) ; <3>
;; true