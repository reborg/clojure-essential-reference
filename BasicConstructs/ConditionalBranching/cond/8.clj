(clojure.walk/macroexpand-all
  '(cond
    (:error data) 500
    (not= :failure (:status data)) 200
    :else 400))

;; (if (:error data)
;;   500
;;   (if (not= :failure (:status data))
;;     200
;;     (if :else
;;       400
;;       nil)))