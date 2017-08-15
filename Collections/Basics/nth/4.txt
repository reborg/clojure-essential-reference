(defn to-hash [n] ; <1>
  (bit-and (hash n) 0xFFFF))

(defn grow [upto ht] ; <2>
  (if (> upto (count ht))
    (let [t (transient ht)]
      (dotimes [i (- upto (count ht))] (conj! t nil))
      (persistent! t))
    ht))

(defn assign [ht kvs] ; <3>
  (let [t (transient ht)]
    (doseq [[k v] kvs] (assoc! t k v))
    (persistent! t)))

(defn with-hashed-keys [args] ; <4>
  (map (fn [[k v]] (vector (to-hash k) v)) (partition 2 args)))

(defn put [ht & args] ; <5>
  (cond
    (odd? (count args)) (throw (IllegalArgumentException.))
    (zero? (count args)) ht
    :else (let [kvs (with-hashed-keys args)
                ht (grow (apply max (map first kvs)) ht)]
            (assign ht kvs))))

(defn hashtable [& args] ; <6>
  (apply put [] args))

(defn fetch [ht k] ; <7>
  (nth ht (to-hash k)))