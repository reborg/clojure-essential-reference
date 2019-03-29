(import '[clojure.lang IDeref])
(def DocumentException (get-proxy-class Exception IDeref)) ; <1>
(def SyntaxException (get-proxy-class Exception IDeref))
(def FormattingException (get-proxy-class Exception IDeref))

(defn bail ; <2>
  ([ex s]
    (throw
      (-> ex
        (construct-proxy s)
        (init-proxy
          {"deref" (fn [this] (str "Cause: " s))}))))
  ([ex s ^Exception e]
    (throw
      (-> ex
        (construct-proxy s e)
        (init-proxy
          {"deref" (fn [this] (str "Root: " (.getMessage e)))})))))

(defn verify-age [^String s] ; <3>
  (try
    (Integer/valueOf s)
  (catch Exception e
    (bail SyntaxException "Age is not a number" e))))

(try ; <4>
  (let [age "AA"]
    (verify-age age))
(catch Exception e @e))
;; "Root: For input string: \"AA\""