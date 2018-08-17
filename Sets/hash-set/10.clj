(require '[clojure.set :refer [union]])

(defn powerset [s]
  (when-first [x s] ; <1>
    (let [p (or (powerset (disj s x)) (hash-set #{}))] ; <2>
      (union p (set (map conj p (repeat x)))))))  ; <3>

(powerset #{1 2 3}) ; <4>
;; #{#{} #{3} #{2} #{1} #{1 3 2} #{1 3} #{1 2} #{3 2}}