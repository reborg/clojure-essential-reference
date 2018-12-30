(def fmt "~#[nope~;~a~;~a and ~a~:;~a, ~a~]~#[~; and ~a~:;, ~a, etc~].")
(apply cl-format nil fmt [1 2]) ;; "1 and 2."
(apply cl-format nil fmt [1 2 3]) ;; "1, 2 and 3."
(apply cl-format nil fmt [1 2 3 4]) ;; "1, 2, 3, etc."

(def fmt "I see ~[no~:;~:*~r~] fish~:*~[es~;~:;es~].")

(cl-format nil fmt 0) ;; "I see no fishes."
(cl-format nil fmt 1) ;; "I see one fish."
(cl-format nil fmt 100) ;; "I see one hundred fishes."