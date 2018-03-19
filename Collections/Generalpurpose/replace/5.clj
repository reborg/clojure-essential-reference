(def user {:name "jack" :city "London" :id 123})

(defn entry [k v] (clojure.lang.MapEntry/create k v)) ; <1>

(def sub {(entry :city "London") [:postcode "WD12"]}) ; <2>

(into {} (replace sub user))                          ; <3>
;; {:name "jack", :postcode "WD12", :id 123}