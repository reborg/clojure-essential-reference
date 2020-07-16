(map ; <1>
  #(hash-map :int % :char (char %) :hex (format "%x" %))
  (filter (comp #(Character/isWhitespace %) char) (range 65536)))

;;({:int 9     :hex "9"    :char \tab}
;; {:int 10    :hex "a"    :char \newline}
;; {:int 11    :hex "b"    :char \ } ; <2>
;; {:int 12    :hex "c"    :char \formfeed}
;; {:int 13    :hex "d"    :char \return}
;; {:int 28    :hex "1c"   :char \}
;; [...]

(require '[clojure.string :as s]) ; <3>

(s/blank? "\t \n \u000b \f \r \u001c \u001d \u001e \u001f")
;; true
(s/blank? "\u0020 \u1680 \u2000 \u2001 \u2002 \u2003")
;; true
(s/blank? "\u2004 \u2005 \u2006 \u2008 \u2009")
;;true
(s/blank? "\u200a \u2028 \u2029 \u205f \u3000")
;;true