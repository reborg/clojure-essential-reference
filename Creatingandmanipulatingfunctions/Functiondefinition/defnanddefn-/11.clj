(defn get-bytes [^String s]                   ; <1>
  (.getBytes s (StandardCharsets/UTF_8)))

(defn compute-hmac [^Mac mac canonical]       ; <2>
  (.doFinal mac (get-bytes canonical)))

(time (dotimes [i 100000]
  (sign-request (str "http://example.com/tx/" i))))

;; "Elapsed time: 449.417098 msecs"           ; <3>