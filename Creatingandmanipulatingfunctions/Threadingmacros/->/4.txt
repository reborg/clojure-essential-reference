(defn prepare [req]
  (-> req
      (assoc :url (str (:host req) (:path req)))
      (assoc :coord [(Double/valueOf (:x req)) (Double/valueOf (:y req))])))

(prepare req)
;; {:host "http://mysite.com", :path "/a/123", :x "15.1", :y "84.2", :url "http://mysite.com/a/123", :coord [15.1 84.2]}