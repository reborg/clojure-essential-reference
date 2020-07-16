(import 'java.util.ArraList)

(flatten [[{:a 1} #{2 3} (doto (ArrayList.) (.add 1) (.add 2))]]) ; <1>

;; ({:a 1} #{3 2} [1 2])