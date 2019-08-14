(remove-method calculate :twoargs) ; <1>
(calculate {:op 'pow :expr [[:int 2] [:int 2]]}) ; <2>
;; RuntimeException Don't know how to calculate {:op pow [...]}