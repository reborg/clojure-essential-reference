(serve 10001) ; <1>
;; #object[future_call 0x41da {:status :pending, :val nil}]

(serve 10001) ; <2>
;; "Port already serving requests."

;; telnet localhost 10001 ; <3>
;; Connected to localhost.
;; Escape character is '^]'.
;; hello
;; hello
;; Connection closed by foreign host.