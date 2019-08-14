(def ops
 {'plus [+ :varargs] ; <1>
  'times [* :varargs]
  'divide [/ :varargs]
  'pow [#(Math/pow %1 %2) :twoargs]})