(edn/read-string ; <1>
  {:readers {'point identity}}
  "#point [1 2]")
;; [1 2]

(edn/read-string ; <2>
  {:readers {'inst (constantly "override")}}
  "#inst \"2017-08-23T10:22:22.000-00:00\"")
;; "override"