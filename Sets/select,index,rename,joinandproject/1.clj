(def users ; <1>
  #{{:user-id 1 :name "john"   :age 22 :type "personal"}
    {:user-id 2 :name "jake"   :age 28 :type "company"}
    {:user-id 3 :name "amanda" :age 63 :type "personal"}})

(def accounts  ; <2>
  #{{:acc-id 1 :user-id 1 :amount 300.45 :type "saving"}
    {:acc-id 2 :user-id 2 :amount 1200.0 :type "saving"}
    {:acc-id 3 :user-id 1 :amount 850.1 :type "debit"}})