(binding [*compile-files* true
          *compile-path* "."
          *compiler-options* {:disable-locals-clearing true}] ; <1>
  (eval '(let [s "potentially-huge"] (^:once fn* [] s))))