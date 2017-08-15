(defmacro future [& body]
  `(future-call (fn [] ~@body)))