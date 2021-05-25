(binding [*compile-files* true
          *compile-path* "."]
  (eval '(let [s "potentially-huge"] (^:once fn* [] s)))) ; <1>