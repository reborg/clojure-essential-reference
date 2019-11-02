  (defn <tags> name fdecl)

  fdecl :=> <docstring> ^<metamap> arities <metamap>

  arities :=> <metamap> [arity] <body>
              OR
              (<metamap> [arity1] <body>)
              (<metamap> [arity2] <body>)
              ..
              (<metamap> [arityN] <body>)

  arity :=> <ret-typehint> [<arg1-typehint> arg1
                            ..
                            <argN-typehint> argN]