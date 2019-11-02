(defn prepare [req] ; <1>
  (-> req
      (assoc :url (str (:host req) (:path req))
             :coord [(Double/valueOf (:x req)) (Double/valueOf (:y req))])
      (dissoc :x-forward-to :x :y)
      (update :trace conj :prepared)))