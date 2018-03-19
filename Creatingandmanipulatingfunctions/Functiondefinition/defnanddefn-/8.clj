(defn save! [item]
  {:pre [(clojure.test/are [x] x                      ; <1>
           (map? item)                                ; <2>
           (string? (:name item))                     ; <3>
           (#{:double :triple} (:width item)))]       ; <4>
   :post [(clojure.test/is (= 10 (:id %)))]}          ; <5>
  (assoc item :id 10))

(save! {:name 1 :width :single})

;; FAIL in () (test.clj:-1)                           ; <6>
;; expected: (string? (:name item))
;;   actual: (not (string? 1))
;;
;; FAIL in () (test.clj:-1)
;; expected: (#{:double :triple} (:width item))
;;   actual: nil
;;
;; AssertionError Assert failed: (clojure.test/are [x] x (map? item)
;; (string? (:name item))
;; (#{:double :triple} (:width item)))