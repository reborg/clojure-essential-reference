(ns math-lib ; <1>
  (:import IntegerMath))

(defn plus [x y] ; <2>
  (IntegerMath/plus x y))