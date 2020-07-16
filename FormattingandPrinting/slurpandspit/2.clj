(def book (slurp "https://tinyurl.com/wandpeace")) ; <1>
(reduce str (take 24 book))
;; "\r\nThe Project Gutenberg"