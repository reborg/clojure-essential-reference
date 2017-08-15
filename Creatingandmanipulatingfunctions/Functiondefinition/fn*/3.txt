(defmacro future [& body]
  `(future-call (^:once fn* [] ~@body)))