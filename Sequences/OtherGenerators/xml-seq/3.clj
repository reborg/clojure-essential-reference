(require '[clojure.java.io :as io])
(require '[clojure.xml :as xml])

(def feeds
 [[:guardian  "https://www.theguardian.com/world/rss"]
  [:wash-post "http://feeds.washingtonpost.com/rss/rss_blogpost"]
  [:nytimes "https://rss.nytimes.com/services/xml/rss/nyt/World.xml"]
  [:wsj "https://feeds.a.dj.com/rss/RSSWorldNews.xml"]
  [:reuters "http://feeds.reuters.com/reuters/UKTopNews"]])

(defn search-news [q [feed url]]
  (let [content (comp first :content)]
    [feed
     (sequence
       (comp
         (filter (comp string? content))   ; <1>
         (filter (comp #{:title} :tag))    ; <2>
         (filter #(re-find q (content %))) ; <3>
         (map content))
       (xml-seq (xml/parse url)))]))

(pmap (partial search-news #"(?i)climate") feeds) ; <4>

;;([:guardian ("30 years of Australia's hollow promises on climate policy")]
;; [:wash-post ()]
;; [:nytimes ()]
;; [:wsj ()]
;; [:reuters ()])