(require '[clojure.test :refer [with-test]])

(with-test ; <1>
  (defn sum [a b] (+ a b))
  (println "test called"))

(test #'sum) ; <2>
;; test called
;; :ok ; <3>