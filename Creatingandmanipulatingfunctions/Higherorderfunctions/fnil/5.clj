(def greetings (fnil clojure.string/replace "Nothing to replace" "Morning" "Evening"))

(greetings "Good Morning!" "Morning" "Evening")
;; "Good Evening!"
(greetings nil "Morning" "Evening")
;; "Nothing to replace"
(greetings "Good Morning!" nil "Evening")
;; "Good Evening!"
(greetings "Good Morning!" "Morning" nil)
;; "Good Evening!"