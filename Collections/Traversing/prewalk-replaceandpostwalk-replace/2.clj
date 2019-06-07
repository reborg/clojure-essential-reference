(def ^:const greek ; <1>
	'[α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ σ τ υ φ χ ψ ω])

(prewalk-replace greek data) ; <2>
;; [[β γ] [δ :a [ζ [η θ :b [] κ] λ [μ :c]]] [:d ο]]