(ns math-lib-client
  (:require [math-lib :as m]))

(defn vsum [x xs]
  (map #(m/plus x %) xs))     ; <1>

(vsum 3 [1 2 3])

;; int plus(Object Object)    ; <2>
;; int plus(Object Object)
;; int plus(Object Object)
;; (4 5 6)