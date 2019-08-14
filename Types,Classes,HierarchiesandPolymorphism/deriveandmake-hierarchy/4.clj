(def h (custom-hierarchy ; <1>
  [:unix :os]
  [:windows :unix]
  [:mac :unix]))

(isa? h :windows :unix)
;; true

(def h (underive h :windows :unix)) ; <2>

(isa? h :windows :unix)
;; false