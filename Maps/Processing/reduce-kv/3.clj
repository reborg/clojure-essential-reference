(def env ; <1>
  {"TERM_PROGRAM" "iTerm.app"
   "SHELL" "/bin/bash"
   "COMMAND_MODE" "Unix2003"})

(defn transform [^String s] ; <2>
  (some-> s
    .toLowerCase
    (.replace "_" "-")
    keyword))

(reduce-kv ; <3>
  (fn [m k v] (assoc m (transform k) v))
  {}
  env)

;; {:term-program "iTerm.app", ; <4>
;;  :shell "/bin/bash",
;;  :command-mode "Unix2003"}