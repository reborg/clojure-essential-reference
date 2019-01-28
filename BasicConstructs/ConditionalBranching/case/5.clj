(case 'pi ; <1>
  'alpha  \α
  'beta   \β
  'pi     \π)

;; IllegalArgumentException: Duplicate case test constant: quote

(macroexpand ''alpha) ; <2>
;; (quote alpha)

(case 'pi  ; <3>
  (quote alpha) \α
  (quote beta)  \β
  (quote pi)    \π)

;; IllegalArgumentException: Duplicate case test constant: quote

(case 'pi ; <4>
  alpha  \α
  beta   \β
  pi     \π)
;; \π