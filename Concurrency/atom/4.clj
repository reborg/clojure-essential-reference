(defn swap-or-bail! [a f & [attempts]] ; <1>
  (loop [i (or attempts 3)]
    (if (zero? i)
      (println "Could not update. Bailing out.")
      (let [old (deref a)
            success? (compare-and-set! a old (f old))] ; <2>
        (when-not success?
          (println "Update failed. Retry" i)
          (recur (dec i)))))))

(defn slow-inc [x] ; <3>
  (Thread/sleep 5000)
  (inc x))

(def a (atom 0))
(def f (future (swap-or-bail! a slow-inc))) ; <4>
(reset! a 1) ; <5>
;; "Update failed. Retry 3"
(reset! a 2)
;; "Update failed. Retry 2"
(reset! a 3)
;; "Update failed. Retry 1"
;; Could not update. Bailing out.