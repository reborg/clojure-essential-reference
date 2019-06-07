(ns my-namespace) ; <1>

(require '[clojure.repl :refer [demunge stack-element-str]]) ; <2>

(defn my-funct! [] (throw (ex-info "error" {})))

(str my-funct!) ; <3>
;; "my_namespace$my_funct_BANG_@621ada4f"

(demunge (str my-funct!)) ; <4>
;; "my-namespace/my-funct!@4e212104"

(def stack-trace (try (my-funct!) (catch Exception e (.getStackTrace e)))) ; <5>

(nth stack-trace 2) ; <6>
;; [my_namespace$my_funct_BANG_ invokeStatic "form-init4179141376169992155.clj" 1]

(stack-element-str (nth stack-trace 2)) ; <7>
;; "my-namespace/my-funct! (form-init4179141376169992155.clj:1)"