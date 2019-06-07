(require '[clojure.xml :as xml]) ; <1>

(def document (xml/parse "http://feeds.arstechnica.com/arstechnica/software")) ; <2>

(keys document) ; <3>
;; (:tag :attrs :content)