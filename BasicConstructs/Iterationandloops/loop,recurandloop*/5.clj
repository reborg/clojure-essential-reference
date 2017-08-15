  (target [binding-parameters]
    (<body>
      (recur binding-parameters)))

  target :=> <loop> | <defn> | <defn-> | <fn> | <fn*> | <#()>
  binding-parameters :=> params | bindings
  params :=> <sym1>, <sym2> .. <sym>
  bindings :=> <bind1> <expr1>, <bind2> <expr2> .. <bind> <expr>