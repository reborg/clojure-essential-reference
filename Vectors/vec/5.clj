(import '(java.util UUID))

(defn search-merchandise [& search-options]                           ; <1>
  '({:description  "Pencil Dress"             :type        :dress
     :color        :blue                      :price       60}
    {:description  "Asymmetric Lace Dress"    :type        :dress
     :color        :blue                      :price       70}
    {:description  "Short Sleeve Wrap Dress"  :type        :dress
     :color        :blue                      :price       45}))

(def cache (atom {}))                                                 ; <2>

(defn cache-user-search-results! [search-id search-results]
  (swap! cache assoc search-id (vec search-results)))                 ; <3>

(defn retrieve-user-search-results [search-id page]                   ; <4>
  (get (get @cache search-id) page))

(defn render-to-json [{:keys [description price]}]                    ; <5>
  (format "[{'description':'%s', 'price':'%s'}]" description price))

(def search-id (str (UUID/randomUUID)))                               ; <6>

(cache-user-search-results!
  search-id
  (search-merchandise {:type :dress :color :blue}))

(println
  (-> (retrieve-user-search-results search-id 0)
      render-to-json))

;; [{'description':'Pencil Dress', 'price':'60'}]

(println                                                              ; <7>
  (-> (retrieve-user-search-results search-id 2)
      render-to-json))

;; [{'description':'Short Sleeve Wrap Dress', 'price':'45'}]