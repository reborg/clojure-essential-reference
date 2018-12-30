(s/trimr "   *Spaces on the left are not removed with trimr.*     ") ; <1>
;; "   *Spaces on the left are not removed with trimr.*"

(s/triml "   *Spaces on the right are not removed with triml.*     ") ; <2>
;; "*Spaces on the right are not removed with triml.*     "