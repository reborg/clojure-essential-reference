(require '[clojure.xml :as xml])

(defn fetch-async [url] ; <1>
  (future (doall (xml-seq (xml/parse url)))))

(let [guardian (fetch-async "https://www.theguardian.com/world/rss") ; <2>
      nytimes (fetch-async "http://rss.nytimes.com/services/xml/rss/nyt/World.xml")
      wsj (fetch-async "http://www.wsj.com/xml/rss/3_7085.xml")
      reuters (fetch-async "http://feeds.reuters.com/reuters/UKTopNews")]
  (count (concat ; <3>
           (take 10 @guardian)
           (take 5 (drop 15 @nytimes))
           (take 5 (drop 20 @wsj))
           (take 10 @reuters))))