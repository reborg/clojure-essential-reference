(require '[clojure.xml :as xml])

(defn fetch-async [url]         ; <1>
  (future (doall (xml-seq (xml/parse url)))))

(let [guardian (fetch-async "https://git.io/guardian-world-rss-xml") ; <2>
      nytimes (fetch-async "https://git.io/nyt-world-rss-xml")
      reuters (fetch-async "https://git.io/reuters-rss-xml")
      washpost (fetch-async "https://git.io/washpost-rss-xml")
      wsj (fetch-async "https://git.io/wsj-rss-xml")]
  (count (concat                ; <3>
           (take 10 @guardian)
           (take 5 (drop 15 @nytimes))
           (take 5 (drop 20 @wsj))
           (take 2 (drop 5 @washpost))
           (take 10 @reuters))))
;; 32