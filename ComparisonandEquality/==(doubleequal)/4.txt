(defn group-orders [& markets]                              ; <1>
  (group-by :symbol (apply concat markets)))

(defn- compatible? [{t1 :type b1 :bid} {t2 :type b2 :bid}]  ; <2>
  (and (not= t1 t2) (== b1 b2)))

(defn- matching [orders]                                    ; <3>
  (for [order1 orders
        order2 orders
        :when (compatible? order1 order2)]
    #{order1 order2}))

(defn exchange [listing]                                    ; <4>
  (->> listing
       (map last)                                           ; <5>
       (mapcat matching)                                    ; <6>
       distinct))                                           ; <7>

(exchange (group-orders tokyo london nyc))                  ; <8>
;; (#{{:bid 22 :market :LDN :symbol "AAPL" :type :sell}
;;    {:bid 22.0 :market :NYC :symbol "AAPL" :type :buy}})