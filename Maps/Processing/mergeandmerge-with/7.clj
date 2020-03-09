(defprotocol IComplex ; <1>
  (sum [c1 c2]))

(defrecord Complex [re im]
  IComplex
  (sum [c1 c2] (merge-with + c1 c2))) ; <2>

(sum (Complex. 2 5) (Complex. 1 3))
;; #user.Complex{:re 3, :im 8}