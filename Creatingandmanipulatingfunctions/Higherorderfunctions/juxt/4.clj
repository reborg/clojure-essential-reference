(def words ["book" "this" "an" "awesome" "is"])

(map (juxt count identity) words) ; <1>
;; ([4 "book"] [4 "this"] [2 "an"] [7 "awesome"] [2 "is"])