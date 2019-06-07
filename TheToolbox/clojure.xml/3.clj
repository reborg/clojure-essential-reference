(require '[clojure.xml :as xml]
         '[clojure.java.io :as io])

(def conforming ; <1>
  "<?xml version='1.0' encoding='utf-8'?>
     <!DOCTYPE html SYSTEM 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd'>
     <html xmlns='http://www.w3.org/1999/xhtml'>
       <article>Hello</article>
     </html>")

(def xml ; <2>
  (-> conforming .getBytes io/input-stream xml/parse))

;; hangs 60 seconds if missing network ; <3>
;; {:tag :html,
;;  :attrs {:xmlns "http://www.w3.org/1999/xhtml"},
;;  :content [{:tag :article, :attrs nil, :content ["Hello"]}]}