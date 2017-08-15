(def query "guidx=123&flip=true")

(defn params [query]                            ; <1>
  (apply merge                                  ; <5>
    (map #(apply hash-map %)                    ; <4>
      (map #(clojure.string/split % #"=")       ; <3>
        (clojure.string/split query #"&")))))   ; <2>

(params query)
;; {"guidx" "123", "flip" "true"}