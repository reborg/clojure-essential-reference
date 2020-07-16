(require '[clojure.template :refer [do-template]])

(do-template [x] (println x) 1 2 3)
;; 1
;; 2
;; 3
;; nil