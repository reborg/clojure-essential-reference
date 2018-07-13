(require '[clojure.string :as s])

(def long-url ; <1>
  (str "https://notifications.google.com/u/0/_"
       "/NotificationsOgbUi/data/batchexecute?"
       "f.sid=4896754370137081598&hl=en&soc-app=208&"
       "soc-platform=1&soc-device=1&_reqid=53227&rt="))

(defn split-pair [pair] ; <2>
  (let [[k v] (s/split pair #"=")]
    (if v
      [k v]
      [k nil])))

(defn params [url] ; <3>
  (as-> url x
    (s/split x #"\?")
    (last x)
    (s/split x #"\&")
    (mapcat split-pair x)
    (apply hash-map x)))

(params long-url) ; <4>
;; {"soc-device" "1"
;;  "_reqid" "53227"
;;   "soc-platform" "1"
;;   "f.sid" "4896754370137081598"
;;   "rt" nil
;;   "soc-app" "208"
;;   "hl" "en"}