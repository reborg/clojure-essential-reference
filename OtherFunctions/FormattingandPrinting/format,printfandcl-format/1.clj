(format "%3d" 1) ;; "  1" ; <1>
(format "%03d" 1) ;; "001" ; <2>
(format "%.2f" 10.3456) ;; "10.35" ; <3>
(format "%10s", "Clojure") ;; "   Clojure" ; <4>
(format "%-10s", "Clojure") ;; "Clojure   " ; <5>
(format "%-11.11s" "truncatefixedsize") ;; "truncatefix" ; <6>
(format "%tT" (java.util.Calendar/getInstance)) ;; "22:15:11" ; <7>