(defn smoke [smoker ingr1 ingr2] ; <1>
  (let [i1 (deref ingr1 100 "fail!")
        i2 (deref ingr2 100 "fail!")]
    (swap! msgs conj (str smoker " " i1 " " i2))))

(run)
(print @msgs)

;; ["Round 0" ; <2>
;;  "tobacco holder :paper :matches"
;;  "Round 1"
;;  "matches holder :tobacco :paper"
;;  "Round 2"
;;  "matches holder :tobacco :paper"
;;  "Round 3"
;;  "tobacco holder :paper :matches"
;;  "Round 4"
;;  "tobacco holder :paper :matches"
;;  "matches holder fail! :paper"
;;  "paper holder fail! :matches"
;;  "tobacco holder :paper fail!"
;;  "paper holder :tobacco fail!"
;;  "paper holder :tobacco fail!"
;;  "tobacco holder :paper fail!"
;;  "matches holder fail! :paper"
;;  "paper holder fail! :matches"
;;  "matches holder fail! :paper"
;;  "paper holder fail! :matches"]