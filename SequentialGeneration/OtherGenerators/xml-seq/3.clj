(require '[clojure.java.io :as io])
(require '[clojure.xml :as xml])

(def feeds
 [[:guardian  "https://www.theguardian.com/world/rss"]
  [:wash-post "http://feeds.washingtonpost.com/rss/rss_blogpost"]
  [:nytimes "http://rss.nytimes.com/services/xml/rss/nyt/World.xml"]
  [:wsj "http://www.wsj.com/xml/rss/3_7085.xml"]
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

(pmap (partial search-news #"(?i)breaking") feeds) ; <4>

;;([:guardian ("Climate change push European cities towards breaking point'")]
;; [:wash-post ()]
;; [:nytimes ()]
;; [:wsj ()]
;; [:reuters ()])