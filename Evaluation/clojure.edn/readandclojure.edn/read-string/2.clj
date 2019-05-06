(edn/read-string ; <1>
  "#point [1 2]")
;; RuntimeException No reader function for tag point

(edn/read-string ; <2>
  {:readers {'point identity}}
  "#point [1 2]")
;; [1 2]

(edn/read-string ; <3>
  {:readers {'inst (constantly "override")}}
  "#inst \"2017-08-23T10:22:22.000-00:00\"")
;; "override"