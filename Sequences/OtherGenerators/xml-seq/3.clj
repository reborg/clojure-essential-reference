(require '[clojure.java.io :as io])
(require '[clojure.xml :as xml])

(def feeds
 [[:guardian "https://git.io/guardian-world-rss-xml"]
  [:wash-post "https://git.io/washpost-rss-xml"]
  [:nytimes "https://git.io/nyt-world-rss-xml"]
  [:wsj "https://git.io/wsj-rss-xml"]
  [:reuters "https://git.io/reuters-rss-xml"]])

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

;; ([:guardian ()]
;;  [:wash-post ()]
;;  [:nytimes
;;   ("Economic Giants Are Restarting.
;;     Here’s What It Means for Climate Change.")]
;;  [:wsj ()]
;;  [:reuters ()])