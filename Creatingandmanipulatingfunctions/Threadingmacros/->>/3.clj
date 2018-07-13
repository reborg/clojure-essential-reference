(def query "guidx=123&flip=true")

(defn params [query]                            ; <1>
  (apply merge                                  ; <2>
    (map #(apply hash-map %)                    ; <3>
      (map #(clojure.string/split % #"=")       ; <4>
        (clojure.string/split query #"&")))))   ; <5>

(params query)
;; {"guidx" "123", "flip" "true"}