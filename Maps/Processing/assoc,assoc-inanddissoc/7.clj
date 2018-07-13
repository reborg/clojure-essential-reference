(def articles ; <1>
  [{:title "Another win for India"
    :date "2017-11-23"
    :ads [2 5 8]
    :author "John McKinley"}
   {:title "Hottest day of the year"
    :date "2018-08-15"
    :ads [1 3 5]
    :author "Emma Cribs"}
  {:title "Expected a rise in Bitcoin shares"
    :date "2018-12-11"
    :ads [2 4 6]
    :author "Zoe Eastwood"}])

(assoc-in articles [2 :ads 1] 3) ; <2>

(def articles
  [{:title "Another win for India"
    :date "2017-11-23"
    :ads [2 5 8]
    :author "John McKinley"}
   {:title "Hottest day of the year"
    :date "2018-08-15"
    :ads [1 3 5]
    :author "Emma Cribs"}
  {:title "Expected a rise in Bitcoin shares"
    :date "2018-12-11"
    :ads [2 3 6] ; <3>
    :author "Zoe Eastwood"}])