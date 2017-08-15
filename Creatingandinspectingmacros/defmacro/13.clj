(defmacro just-print-me [& args]
  (println (apply list 'just-print-me args)))