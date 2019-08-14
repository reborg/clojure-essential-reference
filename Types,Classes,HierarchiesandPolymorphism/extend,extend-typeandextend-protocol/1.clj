(require '[clojure.string :refer [replace]])

(defprotocol Reflect ; <1>
  (declared-methods [this]))

(extend java.lang.Object ; <2>
  Reflect
  {:declared-methods
   (fn [this]
     (map
       (comp #(replace % #"clojure\.lang\." "cl.")
             #(replace % #"java\.lang\." "jl."))
       (.getDeclaredMethods (class this))))})

(pprint (declared-methods (atom nil))) ; <3>

;; ("public jl.Object cl.Atom.reset(jl.Object)"
;;  "public jl.Object cl.Atom.swap(cl.IFn,jl.Object)"
;;  "public boolean cl.Atom.compareAndSet(jl.Object,jl.Object)"
;;  "public jl.Object cl.Atom.deref()")