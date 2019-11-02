  (fn <name> arities)

  arities :=>
  <metamap> [arity] <body>
  OR
  (<metamap> [arity1] <body>)
  (<metamap> [arity2] <body>)
  [..]
  (<metamap> [arityN] <body>)

  arity :=>
  [<arg1-typehint> arg1
   [..]
   <argN-typehint> argN]

  body :=>
  <body-metamap> <forms>

  body-metamap :=>
  {:pre f1 :post f2 :tag tag1 :k :v}