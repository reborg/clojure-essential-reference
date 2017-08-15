(defn genbig [n]                                                  ; <1>
  (->> #(rand-int 10)
       (repeatedly n)
       (apply str)
       (BigInteger.)
       bigint))

(defn I [n] (.toBigInteger n))                                    ; <2>

(defn prime?  [n accuracy]
  (.isProbablePrime (.toBigInteger (bigint n)) accuracy))

(defn next-prime [n]                                              ; <3>
  (loop [candidate n]
    (if (prime? candidate 10)
      candidate
      (recur (if (neg? candidate)
               (dec' candidate)
               (inc' candidate))))))

(defn- mod-pow [b e m]                                            ; <4>
 (bigint (.modPow (I b) (I e) (I (next-prime m)))))

(defn public-share [base secret modulo]                           ; <5>
  (mod-pow base secret modulo))

(defn shared-secret [public secret modulo]                        ; <6>
  (mod-pow public secret modulo))

(def modulo-pub (genbig 30))                                      ; <7>
(def base-pub (genbig 30))

(def a-pub (public-share base-pub 123456789N modulo-pub))         ; <8>
(def b-pub (public-share base-pub 987654321N modulo-pub))

(def a-common-secret (shared-secret b-pub 123456789N modulo-pub)) ; <9>
a-common-secret
;; 395976829969556119817932826983N

(def b-common-secret (shared-secret a-pub 987654321N modulo-pub)) ; <10>
b-common-secret
;; 395976829969556119817932826983N

(= a-common-secret b-common-secret)                               ; <11>
;; true