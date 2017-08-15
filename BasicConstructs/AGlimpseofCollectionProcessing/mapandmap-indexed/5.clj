(def products                                         ; <1>
  [{:id 1 :min-loan 6000 :rate 2.6}
   {:id 2 :min-loan 3500 :rate 3.3}
   {:id 3 :min-loan 500 :rate 7.0}
   {:id 4 :min-loan 5000 :rate 4.8}
   {:id 5 :min-loan 1000 :rate 4.3}])

(defn compound-interest [product loan-amount period]  ; <2>
  (let [rate (inc (/ (:rate product) 100. 12))]
    (* loan-amount (Math/pow rate (* 12 period)))))

(defn add-costs [loan-amount period]                  ; <3>
  (fn [product]
    (let [total-cost (compound-interest product loan-amount period)
          credit-cost (- total-cost loan-amount)]
      (-> product
          (assoc :total-cost total-cost)
          (assoc :credit-cost credit-cost)))))

(defn min-amount [loan-amount]                        ; <4>
  (fn [product]
    (> loan-amount (:min-loan product))))

(defn round-decimals [product]                        ; <5>
  (letfn [(round-2 [x] (/ (Math/ceil (* 100 x)) 100))]
    (-> product
      (update-in [:total-cost] round-2)
      (update-in [:credit-cost] round-2))))

(defn cost-of-credit [loan-amount period]             ; <6>
  (->> products
       (filter (min-amount loan-amount))
       (map (add-costs loan-amount period))
       (map round-decimals)
       (sort-by :credit-cost)))

(cost-of-credit 2000 5)

;; ({:id 5 :min-loan 1000 :rate 4.3 :total-cost 2478.78 :credit-cost 478.78}
;;  {:id 3 :min-loan 500  :rate 7.0 :total-cost 2835.26 :credit-cost 835.26})