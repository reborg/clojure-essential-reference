(mapv future [:f1 :f2]) ; <1>
;; CompilerException java.lang.RuntimeException

(pprint (mapv future-call [(fn* [] :f1) (fn* [] :f2)])) ; <2>
;; [#<Future@3ef6c6cd: :f1> #<Future@1d90b8d2: :f2>]