(require '[clojure.string :refer [split-lines]])

(def rules ; <1>
  "If the light is red, you should stop
   If the light is green, you can cross
   If the light is orange, it depends")

(defmacro If [light & args] ; <2>
  (let [[_ _ op v & action] args]
    `(when (= '~light '~v) '~action)))

(defn parenthesize [s] ; <3>
  (->> s
    split-lines
    (remove empty?)
    (map #(str "(" % ")"))))

(defn traffic-light [color rules] ; <4>
  (->> rules
    parenthesize
    (map read-string)
    (map #(list* (first %) color (rest %))) ; <5>
    (some eval)))

(traffic-light 'red rules) ; <6>
;; (you should stop)

(traffic-light 'green rules)
;; (you can cross)

(traffic-light 'orange rules)
;; (it depends)