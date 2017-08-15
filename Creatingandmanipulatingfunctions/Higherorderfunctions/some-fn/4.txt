(defn every [pred coll]                                                   ; <1>
  (loop [items coll acc []]
    (let [res (pred (first items))]
      (cond
        (nil? (seq items)) acc
        call (recur (next items) (conj acc res))
        :else false))))

(defn every-fn [& ps]                                                     ; <2>
  (fn [& args] (every #(every % args) ps)))

(defn all-with-two-and-length-seven [words]                               ; <3>
  (let [two? (partial re-find #"two")
      seven? #(= 7 (count %))]
  (map (every-fn two? seven?) words)))

(all-with-two-and-length-seven ["artwork" "nutwood" "twofold"])           ; <4>
;; ([["two"] [true]] [["two"] [true]] [["two"] [true]])

(all-with-two-and-length-seven ["guestimate" "hardwork" "threefold"])     ; <5>
;; (false false false)