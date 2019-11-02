  (destructure [bindings])

   bindings :->
     [bind1 expr1 .. bindN exprN]

   bind :->
     sym
       OR
     vec-bind
       OR
     map-bind

   vec-bind :->
     [bind1 .. <& bindN> <:as sym>]

   map-bind :->
     {<:keys [qbind1 .. qbindN]>
      <:strs [sym1 .. symN]>
      <:syms [qbind1 .. qbindN]>
      <:or {sym1 expr1 .. symN exprN}>
      <:as sym>
      <bind1 expr1 .. bindN exprN>}