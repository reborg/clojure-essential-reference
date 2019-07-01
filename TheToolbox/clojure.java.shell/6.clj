(println (:out (sh "pwd"))) ; <1>
;; /Users/reborg/prj/my/book

(println (:out (sh "pwd" :dir "/tmp"))) ; <2>
;; /private/tmp