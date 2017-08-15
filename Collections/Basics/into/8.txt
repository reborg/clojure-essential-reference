(defn sign [c] ; <1>
  (with-meta c {:signature (apply str c)}))

(meta (into (sign [1 2 3]) (sign (range 10))))
;; {:signature "123"}