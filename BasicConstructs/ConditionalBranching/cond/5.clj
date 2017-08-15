(defn response-code [data]
  (cond                                     ; <1>
    (:error data) 500
    (not= :failure (:status data)) 200
    :else 400))

(def good-data {:id 8498
                :status :success
                :payload "<tx>489ajfk</tx>"})

(def bad-data {:id 8490
               :error "database error"
               :status nil
               :payload nil})

(response-code good-data)
;; 200

(response-code bad-data)
;; 500