(slurp "/etc/hosts" :encoding "UTF-16") ; <1>
;; "潳琠䑡瑡扡獥ਣਣ潣慬桯"

(spit "/tmp/txt" "Something." :append true) ; <2>
(slurp "/tmp/txt")
;; "Something.Something."