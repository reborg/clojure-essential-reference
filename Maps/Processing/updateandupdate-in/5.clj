(def products ; <1>
  {"A011" {:in-stock 10
           :name "Samsung G5"}
   "B032" {:in-stock 4
           :name "Apple iPhone"}
   "AE33" {:in-stock 13
           :name "Motorola N1"}})

(defn sale [products id] ; <2>
  (update-in
    products
    [id :in-stock]
    (fnil dec 2)))

(get-in ; <3>
  (sale products "B032")
  ["B032" :in-stock])
;; 3