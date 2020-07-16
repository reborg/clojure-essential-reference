(require '[clojure.java.browse-ui :as bu]) ; <1>

(#'bu/open-url-in-swing "http://google.com") ; <2>
;; #object[javax.swing.JFrame 0x268234e0...]