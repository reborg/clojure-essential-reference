(require '[clojure.xml :as xml])

(def document
  (xml/parse
    "http://feeds.bbci.co.uk/news/rss.xml"))

(binding [*print-length* 3] ; <1>
  (pprint document))

;; {:tag :rss,
;;  :attrs
;;  {:xmlns:media "http://search.yahoo.com/mrss/",
;;   :version "2.0",
;;   :xmlns:atom "http://www.w3.org/2005/Atom",
;;   ...},
;;  :content
;;  [{:tag :channel,
;;    :attrs nil,
;;    :content
;;    [{:tag :title, :attrs nil, :content ["BBC News - Home"]}
;;     {:tag :description, :attrs nil, :content ["BBC News - Home"]}
;;     {:tag :link, :attrs nil, :content ["https://www.bbc.co.uk/news/"]}
;;     ...]}]}