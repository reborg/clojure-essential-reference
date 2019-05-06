(def error-data ; <1>
  (try (throw (ex-info "inner" {:recoverable? false}))
    (catch Throwable t
      (try (throw (ex-info "outer" {:recoverable? false} t))
        (catch Throwable t
          (Throwable->map t))))))

(keys error-data) ; <2>
;; (:cause :via :trace)

(:cause error-data) ; <3>
;; "Inner"

(:via error-data) ; <4>
;; [{:type clojure.lang.ExceptionInfo,
;;   :message "outer",
;;   :at [clojure.core$ex_info invokeStatic "core.clj" 4617],
;;   :data {:recoverable? false}}
;;  {:type clojure.lang.ExceptionInfo,
;;   :message "inner",
;;   :at [clojure.core$ex_info invokeStatic "core.clj" 4617],
;;   :data {:recoverable? false}}]

(nth (:trace error-data) 3) ; <5>
;; [user$fn__2151 invoke "form-init5670973898278733609.clj" 1]