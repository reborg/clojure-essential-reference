(require '[clojure.string :refer [split-lines]])

(def mailing ; <1>
   [{:name "Mark", :label "12 High St\nAnchorage\n99501"}
    {:name "John", :label "1 Low ln\nWales\n99783"}
    {:name "Jack", :label "4 The Plaza\nAntioch\n43793"}
    {:name "Mike", :label "30 Garden pl\nDallas\n75395"}
    {:name "Anna", :label "1 Blind Alley\nDallas\n75395"}])

(defn postcodes [mailing] ; <2>
  (map #(last (split-lines (:label %))) mailing))

(postcodes mailing)
;; ("99501" "99783" "43793" "75395" "75395")

(frequencies (postcodes mailing)) ; <3>
;; {"99501" 1, "99783" 1, "43793" 1, "75395" 2}