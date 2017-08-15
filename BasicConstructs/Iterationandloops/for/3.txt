  (for [bindings] <body>)

  binding :=>
  bind-expr OR let-expr OR while-expr OR when-expr

  bind-expr   :=> [<name> <range>]
  let-expr    :=> [:let [<local> <name>]]
  when-expr   :=> [:when <predicate>]
  while-expr  :=> [:while <predicate>]