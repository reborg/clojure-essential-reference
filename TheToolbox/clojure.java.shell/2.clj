(sh "grep" "5" :in (apply str (interpose "\n" (range 50)))) ; <1>

{:exit 0, :out "5\n15\n25\n35\n45\n", :err ""}