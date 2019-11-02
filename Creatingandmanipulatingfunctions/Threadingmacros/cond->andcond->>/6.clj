(def signals
  [111 214 311 413
   107 221 316 421
   112 222 317 471
   115 223 308 482])

(defn process [signals opts]
  (let [{:keys [boost? bypass? interpolate? noise? cutoff?]} opts] ; <1>
    (cond->> signals
        (< (count signals) 10) (map inc)        ; <2>
        interpolate? (mapcat range)             ; <3>
        bypass? (filter bypass?)                ; <4>
        noise? (random-sample noise?)           ; <5>
        cutoff? (take-while #(< % cutoff?)))))  ; <6>

(process signals {:bypass? even? :interpolate? true :noise? 0.5 :cutoff? 200})
;; (0 4 12 14 16 ...