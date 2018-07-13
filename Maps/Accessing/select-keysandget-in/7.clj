(def m ^:original {:a 1 :b 2}) ; <1>

(meta m)
;; {:original true}

(meta (select-keys m [:a])) ; <2>
;; {:original true}