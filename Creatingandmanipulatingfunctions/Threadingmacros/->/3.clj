(def req {:host "http://mysite.com" ; <1>
          :path "/a/123"
          :x "15.1"
          :y "84.2"
          :trace [:received]
          :x-forward-to "AFG45HD32BCC"})

(defn prepare [req] ; <2>
  (update
    (dissoc
      (assoc req
        :url (str (:host req) (:path req))
        :coord [(Double/valueOf (:x req)) (Double/valueOf (:y req))])
      :x-forward-to :x :y)
    :trace conj :prepared))

(pprint (prepare req)) ; <3>
;; {:host "http://mysite.com",
;;  :path "/a/123",
;;  :trace [:received :prepared]
;;  :url "http://mysite.com/a/123",
;;  :coord [15.1 84.2]}