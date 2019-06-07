(def life 42)

(doc life) ; <1>
;; -------------------------
;; user/life
;;   nil
;; nil

(alter-meta! #'life assoc :doc ; <2>
  "Answer to the Ultimate Question of Life the Universe and Everything")

(doc life) ; <3>
;; -------------------------
;; user/life
;;   Answer to the Ultimate Question of Life the Universe and Everything
;; nil