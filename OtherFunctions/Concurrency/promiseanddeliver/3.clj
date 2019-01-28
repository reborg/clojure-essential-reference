(def msgs (atom [])) ; <1>

(defn smoke [smoker ingr1 ingr2] ; <2>
  (swap! msgs conj (str smoker " attempts"))
  (deref ingr1)
  (deref ingr2)
  (swap! msgs conj (str smoker " successful!")))

(defn pick-two [tobacco paper matches] ; <3>
  (rest
    (shuffle
      [#(deliver tobacco :tobacco)
       #(deliver paper :paper)
       #(deliver matches :matches)])))

(defn run [] ; <4>
  (dotimes [i 5]
    (swap! msgs conj (str "Round " i))
    (let [tobacco (promise) paper (promise) matches (promise)]
      (future (smoke "tobacco holder" paper matches))
      (future (smoke "paper holder" tobacco matches))
      (future (smoke "matches holder" tobacco paper))
      (doseq [add (pick-two tobacco paper matches)] (add))
      (Thread/sleep 10)))
  @msgs)