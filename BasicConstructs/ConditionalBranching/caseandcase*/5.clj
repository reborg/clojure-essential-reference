(case 'pi 'alpha \α 'beta \β 'pi \π) ; <1>
;; IllegalArgumentException: Duplicate case test constant: quote

(macroexpand ''alpha) ; <2>
;; (quote alpha)

;; (case 'pi (quote alpha) \α (quote beta) \β (quote pi) \π) ; <3>

(case 'pi alpha \α beta \β pi \π) ; <4>
;; \π