(def sb (new StringBuffer "init")) ; <1>

(.append sb " item")

(str sb) ; <2>
;; "init item"