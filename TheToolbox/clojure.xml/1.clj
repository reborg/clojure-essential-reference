(require '[clojure.xml :as xml]) ; <1>

(def document
  (xml/parse
    "http://feeds.bbci.co.uk/news/rss.xml")) ; <2>

(keys document) ; <3>
;; (:tag :attrs :content)