(defn same-initial? [m]
  (apply = (map (comp first name) (keys m))))

(defn shape-up [m]
  (cond-> m
          true (assoc-in [:k3 :j1] "default")                     ; <1>
          (same-initial? m) (assoc :same true)                    ; <2>
          (map? (:k2 m)) (assoc :k2 (apply str (vals (:k2 m)))))) ; <3>

(map shape-up [{:k1 "k1" :k2 {:h1 "h1" :h2 "h2"} :k3 {:j2 "j2"}}
               {:k1 "k1" :k2 "k2"}
               {:k1 "k1" :k2 {:h1 "h1" :h3 "h3"} :k3 {:j1 "j1"}}])

; ({:k1 "k1", :k2 "h1h2", :k3 {:j2 "j2", :j1 "default"}, :same true}
;  {:k1 "k1", :k2 "k2", :k3 {:j1 "default"}, :same true}
;  {:k1 "k1", :k2 "h1h3", :k3 {:j1 "default"}, :same true})