(def h (custom-hierarchy ; <1>
  [:clerk :person]
  [:owner :person]
  [:unix :os]
  [:bsd :unix]
  [:mac :bsd]))

(isa? h [:mac :owner] [:unix :person]) ; <2>
;; true