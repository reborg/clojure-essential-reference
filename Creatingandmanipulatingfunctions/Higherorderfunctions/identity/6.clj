(def cashiers (ref [1 2 3 4 5])) ; <1>

(defn next-available [] ; <2>
  (some identity @cashiers))

(defn make-available! [n] ; <3>
  (alter cashiers assoc (dec n) n) n)

(defn make-unavailable! [n]
  (alter cashiers assoc (dec n) false) n)

(defn book-lane [] ; <4>
  (dosync
    (if-let [lane (next-available)]
      (make-unavailable! lane)
      (throw (Exception. "All cashiers busy!")))))

(book-lane) ; <5>
;; 1

(book-lane)
;; 2

(dosync (make-available! 2))
;; 2

@cashiers
;; [false 2 3 4 5]