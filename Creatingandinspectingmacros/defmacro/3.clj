(defmacro when
  "Evaluates test. If logical true, evaluates
  body in an implicit do." ; <1>
  {:added "1.0"} ; <2>
  [test & body]
  (list 'if test (cons 'do body))) ; <3>