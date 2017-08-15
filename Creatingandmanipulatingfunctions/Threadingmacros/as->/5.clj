(def sample-req {:host "http://mysite.com"
                 :path "/a/123"
                 :x "15.1"
                 :y "84.2"})

(defn process [req]
  (as-> req {:keys [:host :path :x :y] :as m} ; <1>
    (assoc m :url (str host path)) ; <2>
    (assoc m :coord [(Double/valueOf x) (Double/valueOf y)]))) ; <3>

(process sample-req)
; ->
; {:host "http://mysite.com"
;  :path "/a/123"
;  :x "15.1"
;  :y "84.2"
;  :url "http://mysite.com/a/123"
;  :coord [15.1 84.2]}