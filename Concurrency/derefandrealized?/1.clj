(def p (promise)) ; <1>

(def f ; <2>
  (future
    (loop []
      (let [v (deref p 100 ::na)]
        (if (= ::na v) (recur) v)))))

(realized? p) ; <3>
;; false
(realized? f)
;; false

(deref f 100 ::not-delivered) ; <4>
;; :user/not-delivered

(deliver p ::finally)
(deref f 100 ::not-delivered) ; <5>
;; :user/finally

(realized? p) ; <6>
;; true
(realized? f)
;; true