(import '[clojure.lang DynamicClassLoader])

(def application-classloader ; <1>
  (.. #'+ getClass getClassLoader))

(def context-classloader ; <2>
  (.. Thread currentThread getContextClassLoader))

(def custom-classloader (DynamicClassLoader.))

(.setContextClassLoader (Thread/currentThread) custom-classloader) ; <3>

(identical?
  (.. (get-classloader (fn [])) getParent)
  custom-classloader) ; <4>
;; true

(binding [*use-context-classloader* false] ; <5>
  (identical?
    (.. (class (fn [])) getClassLoader getParent)
    custom-classloader))
;; true

(import '[clojure.lang DynamicClassLoader])
(def custom-classloader (DynamicClassLoader.))
(.setContextClassLoader (Thread/currentThread) custom-classloader)

(identical?
  (.. (fn []) getClass getClassLoader getParent)
  custom-classloader)
;; true

(binding [*use-context-classloader* false]
  (identical?
    (.. (fn []) getClass getClassLoader getParent)
    custom-classloader))
;; true