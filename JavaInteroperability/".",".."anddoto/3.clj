(import '[java.util Calendar Calendar$Builder])

(.. (Calendar$Builder.) ; <1>
    (setCalendarType "iso8601")
    (setWeekDate 2019 4 (Calendar/SATURDAY))
    (build))

;; #inst "2019-01-26T00:00:00.000+00:00"

(macroexpand ; <2>
  '(.. (Calendar$Builder.)
   (setCalendarType "iso8601")
   (setWeekDate 2019 4 (Calendar/SATURDAY))
   (build)))

;; (. (. (. (Calendar$Builder.) (setCalendarType "iso8601"))
;;       (setWeekDate 2019 4 (Calendar/SATURDAY))) (build))