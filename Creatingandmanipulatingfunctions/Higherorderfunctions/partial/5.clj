(defn- validate [whitelist req]               ; <1>
  (and (every? not-empty (vals req))
       (every? whitelist (keys req))))

(def valid-req
  {:id "1322"
   :cache "rb001"
   :product "cigars"})

(def invalid-req
  {:id "1323"
   :cache "rb004"
   :spoof ""})

(map (partial validate #{:id :cache :product}) ; <2>
  [valid-req invalid-req])
;; (true false)