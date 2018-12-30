(def products ; <1>
  (atom {"A011" {:in-stock 10
                 :name "Samsung G5"}
         "B032" {:in-stock 4
                 :name "Apple iPhone"}
         "AE33" {:in-stock 13
                 :name "Motorola N1"}}))

(defn total-products [products] ; <2>
  (reduce + (map :in-stock (vals products))))

(total-products @products) ; <3>
;; 27

(defn sale! [products id] ; <4>
  (swap! products
         update-in
         [id :in-stock]
         (fnil dec 2))
    products)

(defn sale-simulation! [ids] ; <5>
  (dorun (pmap (partial sale! products) ids)))

(sale-simulation! ["B032" "AE33" "A011" "A011" "AE33" "B032"])
;; nil

(total-products @products) ; <6>
;; 21