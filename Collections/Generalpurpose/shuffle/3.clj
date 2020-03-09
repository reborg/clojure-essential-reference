(defn round-robin [f hosts]
  (let [hosts (shuffle hosts) ; <1>
        idx (atom 0)]         ; <2>
    (fn []
      (f (nth hosts @idx))    ; <3>
      (reset! idx (mod (inc @idx) (count hosts)))))) ; <4>

(defn request [host & [path]] ; <5>
  (println "calling" (format "http://%s/%s" host (or path "index.html"))))

(def hosts ["10.100.89.42" "10.100.86.57" "10.100.23.12"])
(def get-host (round-robin request hosts)) ; <6>

(get) ; <7>
;; calling http://10.100.23.12/index.html
;; 1
