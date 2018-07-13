(def m {:a {:b 2 :c {:d 4 :e 5}}}) ; <1>

(defn dissoc-in [m [k & ks]] ; <2>
  (if ks
    (assoc m k (dissoc-in (get m k) ks))
    (dissoc m k)))

(dissoc-in m [:a :c :d]) ; <3>
;; {:a {:b 2, :c {:e 5}}}