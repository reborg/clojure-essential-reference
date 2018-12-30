(map (juxt contains-two? is-7-long?) (vector "guestimate" "artwork" "threefold")) ; <1>
;; ([nil false] ["two" true] [nil false])