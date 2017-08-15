(defn match-title [doc word]                    ; <1>
  (some->> doc                                  ; <2>
           (re-find #"<title>(.+?)</title>")    ; <3>
           second
           (re-find word)))                     ; <4>

(match-title nil #"nope")
;; nil
(match-title "<html><head>Document without a title</head></html>" #"nope")
;; nil
(match-title "<html><head><title>Once upon a time</title></head></html>" #"upon")
;; upon