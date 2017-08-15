(defn select-matching [m k]                                   ; <1>
  (let [regex (re-pattern (str ".*" k ".*"))]
    (->> (keys m)
         (filter #(re-find regex (.toLowerCase %)))           ; <2>
         (reduce #(assoc %1 (keyword %2) (get m %2)) {}))))   ; <3>

(defn search [k]                                              ; <4>
  (merge (select-matching (System/getProperties) k)
         (select-matching (System/getenv) k)))

(search "user")                                               ; <5>

{:USER "reborg"
 :user.country "GB"
 :user.language "en"
 :user.name "reborg"}