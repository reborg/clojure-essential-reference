(def xml ; <1>
  {:tag :html,
    :attrs {:xmlns "http://www.w3.org/1999/xhtml"},
    :content [{:tag :article, :attrs nil, :content ["Hello"]}]})

(xml/emit xml) ; <2>

;; <?xml version='1.0' encoding='UTF-8'?>
;; <html xmlns='http://www.w3.org/1999/xhtml'>
;; <article>
;; Hello
;; </article>
;; </html>

nil