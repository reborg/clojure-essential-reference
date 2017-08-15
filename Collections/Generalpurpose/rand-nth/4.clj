(def article   ["A" "The" "A" "All"])
(def adjective ["nearer" "best" "better" "darkest"
                 "good" "bad" "hard" "long" "sharp"])
(def subject   ["fool" "wise" "penny" "change" "friend"
                 "family" "proof" "necessity" "experience"
                 "honesty" "no one" "everyone" "every"])
(def action    ["is" "is not" "are" "are not" "help" "be" "create"])
(def ending    ["dying." "a dangerous thing." "a lot of noise." "no pain."
                 "stronger than words." "those who fall." "nothing."])

(def grammar ; <1>
  [article adjective subject action ending])

(defn to-sentence [grammar] ; <2>
  (->> grammar
       (map rand-nth) ; <3>
       (interpose " ")
       (apply str)))

(defn generate ; <4>
  ([] (generate 1))
  ([n]
   (repeatedly n #(to-sentence grammar))))

(generate 5)

;; ("A bad experience is stronger than words."
;;  "A hard change are not stronger than words."
;;  "The nearer honesty are not nothing."
;;  "A good penny create stronger than words."
;;  "A good everyone is not a lot of noise.")