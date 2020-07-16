(require '[clojure.string :as s])

(def link ; <1>
 "Patterson, John: 'Once Upon a Time in the West'")

(def link-escape ; <2>
  {\, "_comma_"
   \space "_space_"
   \. "_dot_"
   \' "_quote_"
   \: "_colon_"
   \newline "_newline_"})

(s/escape link link-escape) ; <3>
;; "Patterson_comma__space_John_colon__space__quote_Once_space_Upon_
;; space_a_space_Time_space_in_space_the_space_West_quote_"