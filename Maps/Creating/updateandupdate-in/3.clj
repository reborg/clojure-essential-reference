(def words {"morning" 2 "bye" 1 "hi" 5 "gday" 2}) ; <1>

(defn insert-word [w words]
  (update words w (fnil inc 0))) ; <2>

(insert-word "hello" words)
;; {"morning" 2, "bye" 1, "hi" 5, "gday" 2, "hello" 1} ; <3>