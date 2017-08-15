(defn x-flip [n] ; <1>
  (comp (take n) (random-sample 0.5)))

(def head-tail-stream ; <2>
	(interleave (repeat "head") (repeat "tail")))

(defn flip-up-to [n] ; <3>
  (into [] (x-flip n) head-tail-stream))

(flip-up-to 10)
;; ["head" "head" "tail" "head" "tail" "head" "tail" "tail"]