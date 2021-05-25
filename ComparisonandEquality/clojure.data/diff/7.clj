(first (diff orig new-service))             ; <1>
;; {:profiles
;;   {:dev
;;     {:dependencies
;;       {:dep8 "1.6.3"}}
;;     :uberjar {:aot "all"}}}

(diff-to-path orig new-service)             ; <2>
;; ([:profiles :dev :dependencies :dep8]
;;  [:profiles :uberjar :aot])

(get-in orig [:profiles :dev :dependencies :dep8]) ; <3>
;; "1.6.3"