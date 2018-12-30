(import 'java.beans.PropertyChangeListener)
(import 'ClassWithProperty)

(let [observed (ClassWithProperty.)
      listener (reify PropertyChangeListener ; <1>
                  (propertyChange [this evt]
                    (let [{:keys [oldValue newValue]} (bean evt)]
                      (println "Button Clicked!" oldValue newValue))))]
  (.addPropertyChangeListener observed listener) ; <2>
  (.setValue observed "I click")) ; <3>

;; Button Clicked! nil I click