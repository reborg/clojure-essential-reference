(defn save! [item]
  {:pre [(clojure.test/are [x] x                      ; <1>
           (map? item)                                ; <2>
           (integer? (:mult item))                    ; <3>
           (#{:double :triple} (:width item)))]       ; <4>
   :post [(clojure.test/is (= 10 (:id %)))]}          ; <5>
  (assoc item :id (* (:mult item) 2)))

(save! {:mult "4" :width :single})

;; FAIL in () (form-init828.clj:2)                    ; <6>
;; expected: (integer? (:mult item))
;;   actual: (not (integer? "4"))
;;
;; FAIL in () (form-init828.clj:2)
;; expected: (#{:double :triple} (:width item))
;;   actual: nil
;;
;; AssertionError Assert failed:
;; (clojure.test/are [x] x (map? item) (integer? (:mult item))
;;  (#{:double :triple} (:width item)))  user/save!


(save! {:mult 4 :width :double})                      ; <7>

;; FAIL in () (form-init8288562343337105678.clj:6)
;; expected: (= 10 (:id %))
;;   actual: (not (= 10 8))
;;
;; AssertionError Assert failed:
;; (clojure.test/is (= 10 (:id %)))

(save! {:mult 5 :width :double})                      ; <8>
;; {:mult 5, :width :double, :id 10}