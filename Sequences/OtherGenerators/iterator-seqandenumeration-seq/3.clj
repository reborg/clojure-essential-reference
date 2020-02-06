(->> "Clojure is the best language"
  (.splitAsStream #"\s+") ; <1>
  .iterator ; <2>
  iterator-seq) ; <3>

;; ("Clojure" "is" "the" "best" "language")