(def tokyo                                                    ; <1>
  [{:market :TYO :symbol "AAPL" :type :buy :bid 22.1M}
   {:market :TYO :symbol "CSCO" :type :buy :bid 12.4M}
   {:market :TYO :symbol "EBAY" :type :sell :bid 22.1M}])

(def london                                                   ; <2>
  [{:market :LDN :symbol "AAPL" :type :sell :bid 23}
   {:market :LDN :symbol "AAPL" :type :sell :bid 22}
   {:market :LDN :symbol "INTC" :type :sell :bid 14}
   {:market :LDN :symbol "EBAY" :type :buy :bid 76}])

(def nyc                                                      ; <3>
  [{:market :NYC :symbol "YHOO" :type :sell :bid 28.1}
   {:market :NYC :symbol "AAPL" :type :buy :bid 22.0}
   {:market :NYC :symbol "INTC" :type :buy :bid 31.9}
   {:market :NYC :symbol "PYPL" :type :sell :bid 44.1}])