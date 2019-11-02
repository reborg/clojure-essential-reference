(defn titles [doc]                    ; <1>
  (some->> doc                        ; <2>
    (re-seq #"<title>(.+?)</title>")  ; <3>
    (map peek)))                      ; <4>

(titles nil)
;; nil
(titles "<html><head>Document without a title</head></html>")
;; nil
(titles "<html><head>
            <title>Once upon a time</title>
            <title>Kingston upon Thames</title>
        </head></html>")
;; ("Once upon a time" "Kingston upon Thames")