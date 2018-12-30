(map ; <1>
  #(hash-map :int % :char (char %) :hex (format "%x" %))
  (filter (comp #(Character/isWhitespace %) char) (range 65536)))

;;({:int 9     :hex "9"    :char \tab}
;; {:int 10    :hex "a"    :char \newline}
;; {:int 11    :hex "b"    :char \ }
;; {:int 12    :hex "c"    :char \formfeed}
;; {:int 13    :hex "d"    :char \return}
;; {:int 28    :hex "1c"   :char \}
;; {:int 29    :hex "1d"   :char \}
;; {:int 30    :hex "1e"   :char \}
;; {:int 31    :hex "1f"   :char \}
;; {:int 32    :hex "20"   :char \space}
;; {:int 5760  :hex "1680" :char \ }
;; {:int 8192  :hex "2000" :char \ }
;; {:int 8193  :hex "2001" :char \ }
;; {:int 8194  :hex "2002" :char \ }
;; {:int 8195  :hex "2003" :char \ }
;; {:int 8196  :hex "2004" :char \ }
;; {:int 8197  :hex "2005" :char \ }
;; {:int 8198  :hex "2006" :char \ }
;; {:int 8200  :hex "2008" :char \ }
;; {:int 8201  :hex "2009" :char \ }
;; {:int 8202  :hex "200a" :char \ }
;; {:int 8232  :hex "2028" :char \ }
;; {:int 8233  :hex "2029" :char \ }
;; {:int 8287  :hex "205f" :char \ }
;; {:int 12288 :hex "3000" :char \　})

(require '[clojure.string :as s]) ; <2>

(s/blank? "\t \n \u000b \f \r \u001c \u001d \u001e \u001f")
;; true
(s/blank? "\u0020 \u1680 \u2000 \u2001 \u2002 \u2003")
;; true
(s/blank? "\u2004 \u2005 \u2006 \u2008 \u2009")
;;true
(s/blank? "\u200a \u2028 \u2029 \u205f \u3000")
;;true