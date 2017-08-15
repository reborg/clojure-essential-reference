(clojure.walk/macroexpand-all '(and false true true))

(let* [and__4467__auto__ false]     ; <1>
  (if and__4467__auto__
    (let* [and__4467__auto__ true]
      (if and__4467__auto__         ; <2>
          true
          and__4467__auto__))
    and__4467__auto__))