(require '[clojure.pprint :refer [cl-format]])

(def num-sentence "~#[nope~;~a~;~a and ~a~:;~a, ~a~]~#[~; and ~a~:;, ~a, etc~].") ; <1>

(apply cl-format nil num-sentence [1 2]) ;; "1 and 2."
(apply cl-format nil num-sentence [1 2 3]) ;; "1, 2 and 3."
(apply cl-format nil num-sentence [1 2 3 4]) ;; "1, 2, 3, etc."

(def pluralize "I see ~[no~:;~:*~r~] fish~:*~[es~;~:;es~].") ; <2>

(cl-format nil pluralize 0) ;; "I see no fishes."
(cl-format nil pluralize 1) ;; "I see one fish."
(cl-format nil pluralize 100) ;; "I see one hundred fishes."