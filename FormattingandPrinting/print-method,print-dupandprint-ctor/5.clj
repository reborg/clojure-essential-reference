(binding [*print-dup* true]
  (read-string (pr-str (Point. 1 2)))) ; <1>
;; [x=1, y=2]