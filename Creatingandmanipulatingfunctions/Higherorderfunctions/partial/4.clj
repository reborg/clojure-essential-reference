(let [f (partial str "thank you ")] (f "all!")) ; <1>
;; "thank you all!"

(let [f #(str %1 "thank you " %2)]  (f "A big " "all!")) ; <2>
;; "A big thank you all!"