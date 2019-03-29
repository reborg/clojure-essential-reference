(def account-1 (ref 1000 :validator pos?)); <1>
(def account-2 (ref 500 :validator pos?))

(defn- to-monthly-statement [k r old new] ; <2>
  (let [direction (if (< old new) "[OUT]" "[IN]")]
    (spit (str "/tmp/statement." k)
      (format "%s: %s$\n" direction (Math/abs (- old new)))
      :append true)))

(add-watch account-1 "acc1" to-monthly-statement) ; <3>
(add-watch account-2 "acc2" to-monthly-statement)

(transfer 300 account-1 account-2) ; <4>
(transfer 500 account-2 account-1)

(println (slurp "/tmp/statement.acc1")) ; <5>
;; [IN]: 300$
;; [OUT]: 500$

(println (slurp "/tmp/statement.acc2"))
;; [OUT]: 300$
;; [IN]: 500$