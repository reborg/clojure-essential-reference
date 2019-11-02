(ns math-lib
  (:import IntegerMath))

(definline plus [x y] ; <1>
  `(IntegerMath/plus ~x ~y))