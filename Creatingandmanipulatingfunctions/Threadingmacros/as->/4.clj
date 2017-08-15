(defn fetch-data [url]
  "Simulating fetching data from URL
   (usually http-kit and json/decode would do)"
  [{:id "aa1" :name "reg-a" :count 2}
   {:id "aa2" :name "reg-b" :count 6}
   {:id "aa7" :name "reg-d" :count 1}
   {:id "aa7" :name nil :count 1}])

(defn url-from [path]
  (str "http://localhost" "/" path))

(defn process [path]
  (as-> path <$>
    (url-from <$>)
    (fetch-data <$>)
    (remove #(nil? (:name %)) <$>)
    (reduce + (map :count <$>))))

(process "home/index.html")
; 9