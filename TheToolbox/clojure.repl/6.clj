(require 'clojure.java.browse)
(require '[clojure.repl :refer [dir-fn]]) ; <1>

(apply str (interpose "," (dir-fn 'clojure.java.browse))); <2>
;; "*open-url-script*,browse-url"