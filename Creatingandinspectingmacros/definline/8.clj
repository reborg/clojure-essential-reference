(ns math-lib-client
  (:require [math-lib :as m]))

(defn vsum [x xs]
  (map #(m/plus (int x) (int %)) xs))

(vsum 3 [1 2 3])
;; int plus(int int)
;; int plus(int int)
;; int plus(int int)
;; (4 5 6)