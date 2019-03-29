(spit "/tmp/test.txt" "Look, I can write a file!") ; <1>
(slurp "/tmp/test.txt") ; <2>
;; "Look, I can write a file!"