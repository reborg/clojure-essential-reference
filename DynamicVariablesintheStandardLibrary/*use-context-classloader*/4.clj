(.getParent (get-classloader (fn [])))
#object["clojure.lang.DynamicClassLoader@53142455"]

(.getParent (get-classloader (fn [])))
#object["clojure.lang.DynamicClassLoader@53142455"] ; <1>

(identical? ; <2>
  (.. Thread currentThread getContextClassLoader)
  (.getParent (get-classloader (fn []))))
;; true