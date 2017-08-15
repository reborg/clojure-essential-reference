(defn share-qty [account price]                                       ; <1>
  (let [accountM (bigdec account)
        priceM (bigdec price)]
    (if (zero? priceM)
      0
      (long (with-precision 5 :rounding DOWN (/ accountM priceM)))))) ; <2>

(defn increment [current price qty]
  (let [currentM (bigdec current)
        priceM (bigdec price)]
    (double (with-precision 5 (+ currentM (* priceM qty))))))         ; <3>

(share-qty 800 1.03)
;; 776

(increment 210 0.38 20)
;; 217.6