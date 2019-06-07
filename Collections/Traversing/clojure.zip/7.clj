(-> xzip zip/down zip/children) ; <1>
;; ("3764882")

(-> xzip zip/down zip/lefts) ; <2>
;; nil

(-> xzip zip/down zip/rights) ; <3>
;; ({:tag :c, :attrs nil, :content ["80.12389"]}
;;  {:tag :f, ;;   :attrs nil,
;;   :content
;;   [{:tag :f1, :attrs nil, :content ["77488"]}
;;    {:tag :f2, :attrs nil, :content ["1921.89"]}]})