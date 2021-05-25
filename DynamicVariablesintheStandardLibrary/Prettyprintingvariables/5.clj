(require '[clojure.pprint :as pprint])

(pprint/write (range 100)) ; <1>
;; (0
;;  1
;;  2
;;  ...
;;  99)nil

(binding [pprint/*print-pretty* false] ; <2>
  (pprint/write (range 100)))
;; (0 1 2 ... 99)nil

(alter-var-root #'pprint/*print-pretty* (constantly false)) ; <3>
(pprint/write (range 100))
;; (0 1 2 ... 99)nil

(alter-var-root #'pprint/*print-pretty* (constantly true)) ; <4>