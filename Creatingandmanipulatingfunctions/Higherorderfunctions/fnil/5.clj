(require '[clojure.string :as string])

(def greetings
  (fnil string/replace "Nothing to replace" "Morning" "Evening"))

(greetings "Good Morning!" "Morning" "Evening") ; <1>
;; "Good Evening!"
(greetings nil "Morning" "Evening")
;; "Nothing to replace"
(greetings "Good Morning!" nil "Evening")
;; "Good Evening!"
(greetings "Good Morning!" "Morning" nil)
;; "Good Evening!"