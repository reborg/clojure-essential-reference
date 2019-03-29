(defmacro future [& body] ; <1>
  `(future-call (^{:once true} fn* [] ~@body))) ; <2>