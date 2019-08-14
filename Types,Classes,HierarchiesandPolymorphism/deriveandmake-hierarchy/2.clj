(def h (custom-hierarchy
  [:unix :os]
  [:bsd :unix]
  [:mac :bsd]))

(isa? h :mac :unix) ; <1>
;; true