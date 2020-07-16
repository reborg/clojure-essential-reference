(defprotocol Foo
  :extend-via-metadata true ; <1>
  (foo [x]))
;; Foo

(foo (with-meta [42] {`foo (fn [x] :boo)})) ; <2>
;; :boo