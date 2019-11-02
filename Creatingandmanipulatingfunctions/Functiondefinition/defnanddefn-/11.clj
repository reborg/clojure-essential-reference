(time (dotimes [i 100000] ; <1>
  (sign-request (str "http://example.com/tx/" i))))

;; "Elapsed time: 1054.507977 msecs"