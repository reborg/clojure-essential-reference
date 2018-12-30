(defn every-fn [& ps] ; <1>
  (fn [& xs]
    (partition (count ps)
      (for [x xs p ps] (p x)))))

(def contains-two? #(re-find #"two" %)) ; <2>
(def is-7-long? #(= 7 (count %)))

((every-fn contains-two? is-7-long?) "guestimate" "artwork" "threefold") ; <3>
;; ((nil false) ("two" true) (nil false))

((every-pred contains-two? is-7-long?) "guestimate" "artwork" "threefold") ; <4>
;; false