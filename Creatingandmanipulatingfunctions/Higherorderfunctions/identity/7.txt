(def they-say                                                     ; <1>
  [{:user "mark" :sentence "hmmm this cake looks delicious"}
   {:user "john" :sentence "Sunday was warm outside."}
   {:user "steve" :sentence "The movie was sooo cool!"}
   {:user "ella" :sentence "Candies are bad for your health"}])

(defn- enthusiast? [s]
  "Find the longest sequence of
  consecutive letters in a sentence"
  (> (->> (:sentence s)
          (partition-by identity)                                 ; <2>
          (map count)
          (apply max)) 2))

(defn enthusiatic-people [sentences]
  (->> sentences
       (filter enthusiast?)
       (map :user)))

(enthusiatic-people they-say)                                     ; <3>
;; ("mark" "steve")