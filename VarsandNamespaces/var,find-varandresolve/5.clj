(defn replace-var [name value] ; <1>
  (let [protected #{'system}]
    (when (resolve protected name)
      (intern *ns* name value))))

(def mydef 1) ; <2>
(def system :dont-change-me)

(replace-var 'x 2) ; <3>
;; nil

(replace-var 'mydef 2) ; <4>
mydef
;; 2

(replace-var 'system 2) ; <5>
system
;; :dont-change-me