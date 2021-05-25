(binding [*print-length* 3
          *print-level* 4] ; <1>
  (pprint document))

;; {:tag :rss,
;;  :attrs
;;  {:xmlns:media "http://search.yahoo.com/mrss/",
;;   :version "2.0",
;;   :xmlns:atom "http://www.w3.org/2005/Atom",
;;   ...},
;;  :content [{#, #, #}]}