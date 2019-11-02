(defn fetch-data [url] ; <1>
  [{:id "aa1" :name "reg-a" :count 2}
   {:id "aa2" :name "reg-b" :count 6}
   {:id "aa7" :name "reg-d" :count 1}
   {:id "aa7" :name nil :count 1}])

(defn url-from [path] ; <2>
  (str "http://localhost" "/" path))

(defn process [path] ; <3>
  (as-> path <$>
    (url-from <$>)
    (fetch-data <$>)
    (remove #(nil? (:name %)) <$>)
    (reduce + (map :count <$>))))

(process "home/index.html")
; 9