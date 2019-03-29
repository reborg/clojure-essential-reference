(def book (slurp "http://www.gutenberg.org/files/2600/2600-0.txt")) ; <1>
(reduce str (take 22 book))
;; "The Project Gutenberg"