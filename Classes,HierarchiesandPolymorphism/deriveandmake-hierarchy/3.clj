(def h (custom-hierarchy
  [:unix :os] [:windows :os] [:os2 :os]
  [:redhat :linux] [:debian :linux]
  [:linux :os] [:linux :unix] [:bsd :unix]
  [:mac :bsd]))

(descendants h :unix) ; <1>
;; #{:redhat :linux :debian :bsd :mac}

(ancestors h :mac) ; <2>
;; #{:unix :os :bsd}