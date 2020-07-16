(require '[clojure.string :refer [join]])

(def post
  {:formatted-tag "Fireworks 2016"
   :destinations ["north" "south"]
   :count 200
   :css-align "ending"
   :normal-title "people expected tonight"
   :headline "Admiral Derek on the ship to Nebraska"})

(->> post
  ((juxt :count :normal-title)) ; <1>
  (join " "))                   ; <2>

;; "200 people expected tonight"