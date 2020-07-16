(defn rule [moves]
  (let [[p1 p2] moves]  ; <1>
      (cond
        (= p1 p2) "tie game"
        (every? #{"rock" "paper"} moves) "paper wins over rock"
        (every? #{"scissor" "rock"} moves) "rock wins over scissor"
        (every? #{"paper" "scissor"} moves) "scissor wins over paper"
        :else "computer can't win that!")))

(defn game-loop []   ; <2>
  (println "Rock, paper or scissors?")
  (let [human (read-line)              ; <3>
        ai (rand-nth ["rock" "paper" "scissor"])
        res (rule [human ai])]
    (if (= "exit" human)
      "Game over"
      (do
        (println (format "Computer played %s: %s" ai res))
        (recur)))))    ; <4>

(game-loop)
;; Rock, paper or scissors?
;; Bang
;; Computer played scissor: computer can't win that!
;; Rock, paper or scissors?
;; paper
;; Computer played rock: paper wins over rock
;; Rock, paper or scissors?
;; exit
;; "Game over"