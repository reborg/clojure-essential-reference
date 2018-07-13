(def matchers ; <1>
  {"next generation" 10
   "incredible" 10
   "revolution" 10
   "you love" 9
   "more robust" 9
   "additional benefits" 8
   "evolve over time" 8
   "brings" 7
   "better solution" 7
   "now with" 6})

(defn avg-xf [rf] ; <2>
  (let [cnt (volatile! 0)]
    (fn
      ([] (rf))
      ([result]
       (rf (if (zero? @cnt)
             0.
             (float (/ result @cnt)))))
      ([result input]
       (vswap! cnt inc)
       (rf result input)))))

(defn score [text] ; <3>
  (transduce
    (comp
      (map #(re-find (re-pattern %) text))
      (keep #(matchers %))
      avg-xf)
    + (keys matchers))) ; <4>

(score "All-new XT600 brings all the features ; <5>
  you love about XT300, now with a new design,
  improved sound and a lower price!")
;; 7.3333335