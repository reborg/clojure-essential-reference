(map (memfn toUpperCase) (map str "hello")) ; <1>
(map (memfn toUpperCase) (re-seq #"\w" "hello")) ; <2>