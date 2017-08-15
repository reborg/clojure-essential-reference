(ns math-lib
  (:import IntegerMath))

(definline plus [x y]
  `(IntegerMath/plus ~x ~y))