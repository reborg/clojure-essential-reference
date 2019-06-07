(defn remove-child [loc] ; <1>
  (zip/replace loc (zip/make-node loc (zip/node loc) (rest (zip/children loc)))))

(-> vzip zip/down zip/rightmost remove-child zip/up zip/node) ; <2>
;; [[1 2] [3 4 [5 10 [11 12]]] [14]]

(-> vzip zip/down zip/rightmost remove-child remove-child zip/up zip/node) ; <3>
;; [[1 2] [3 4 [5 10 [11 12]]] []]