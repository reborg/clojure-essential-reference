(def account-1 (ref 1000)) ; <1>
(def account-2 (ref 500))

(defn transfer [amount]
  (dosync ; <2>
    (when (pos? (- @account-1 amount))
      (alter account-1 - amount) ; <3>
      (alter account-2 + amount))
    {:account-1 @account-1 :account-2 @account-2}))

(transfer 300) ; <4>
;; {:account-1 700, :account-2 800}