(interpose :orange [:green :red :green :red]) ; <1>
;; (:green :orange :red :orange :green :orange :red)

(sequence (interpose :orange) [:green :red :green :red]); <2>
;; (:green :orange :red :orange :green :orange :red)