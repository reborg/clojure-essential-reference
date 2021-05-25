(set! *unchecked-math* true) ; <1>

(defn sum ^long [^long a ^long b] ; <2>
  (+ a b))

(sum 1 2)
;; 3