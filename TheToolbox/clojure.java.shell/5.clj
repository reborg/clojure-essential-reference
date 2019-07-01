(def env
  {"VAR1" "iTerm.app"
   "VAR2" "/bin/bash"
   "COMMAND_MODE" "Unix2003"})

(println
  (:out
    (sh "env" :env env))) ; <1>

;; VAR1=iTerm.app
;; VAR2=/bin/bash
;; COMMAND_MODE=Unix2003