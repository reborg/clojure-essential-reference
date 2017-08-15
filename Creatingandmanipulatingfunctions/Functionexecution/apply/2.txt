(defn rand-b [n]
  (->> (partial rand-int 2) ; <1>
       (repeatedly n)       ; <2>
       (apply str)))        ; <3>

(rand-b 10)
; "1000000011"