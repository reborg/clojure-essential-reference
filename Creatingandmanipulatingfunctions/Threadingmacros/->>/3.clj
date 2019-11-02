(require '[clojure.string :refer [split]])
(def sample-query "guidx=123&flip=true")

(defn params [query]             ; <1>
  (apply merge                   ; <2>
    (map #(apply hash-map %)     ; <3>
      (map #(split % #"=")       ; <4>
        (split query #"&")))))   ; <5>

(params sample-query)
;; {"guidx" "123", "flip" "true"}