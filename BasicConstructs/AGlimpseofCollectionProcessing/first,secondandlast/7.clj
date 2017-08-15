(def temp '((60661 95.2 72.9) (38104 84.5 50.0) (80793 70.2 43.8)))

(defn max-recorded [temp]
  (->> temp
       (sort-by second >)             ; <1>
       first))                        ; <2>

(max-recorded temp)
;; (60661 95.2 72.9)