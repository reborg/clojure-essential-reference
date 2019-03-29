(def account-1 (ref 1000 :validator pos?)) ; <1>
(def account-2 (ref 500 :validator pos?))

(defn transfer [amount a1 a2] ; <2>
  (dosync
    (alter a1 - amount)
    (alter a2 + amount))
  {:account-1 @a1
   :account-2 @a2})

(transfer 1300 account-1 account-2) ; <3>
;; IllegalStateException Invalid reference state