(def example ; <1>
  "#?(:clj (System/currentTimeMillis)
      :cljs (js/Console :log)
      :cljr (|Dictionary<Int32,String>|.)
      :default <anything you want>)")

(defn reader-from [s] ; <2>
  (-> (java.io.StringReader. s)
      (clojure.lang.LineNumberingPushbackReader.)))

(read (reader-from example)) ; <3>
;; RuntimeException Conditional read not allowed

(read {:read-cond :allow} (reader-from example)) ; <4>
;; (System/currentTimeMillis)

(read {:read-cond :preserve} (reader-from example)) ; <5>
;; #?(:clj (System/currentTimeMillis)
;;    :cljs (js/Console :log)
;;    :cljr (|Dictionary<Int32 String>|.)
;;    :default <anything you want>)