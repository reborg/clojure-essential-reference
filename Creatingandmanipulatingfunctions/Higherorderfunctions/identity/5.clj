(defn custom-filter [x] ; <1>
  (if (or (= x nil) (= false x))
    false
    true))

(filter custom-filter [0 1 2 false 3 4 nil 5])    ; <2>
;; (0 1 2 3 4 5)

(filter identity [0 1 2 false 3 4 nil 5])         ; <3>
;; (0 1 2 3 4 5)