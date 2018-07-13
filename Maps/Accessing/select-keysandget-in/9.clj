(def products ; <1>
  [{:product
    {:legal-fee-added {:rate "2%" :period "monthly"}
     :company-name "Together"
     :fee-attributes [["Jan" 8] 99 50 13 38 62]
     :initial-rate 9.15
     :initial-term-label {:bank "provided" :form "Coverage"}
     :created-at 1504556932727}}
   {:product
    {:legal-fee-added {:rate "4.2%" :period "yearly"}
     :company-name "SGI"
     :fee-attributes [["Mar" 8] 99 50 13 38 62]
     :initial-rate 2.15
     :initial-term-label {:bank "provided" :form "Coverage"}
     :created-at 1504556432722}}
   {:product
    {:legal-fee-added {:rate "2.6%" :period "monthly"}
     :company-name "Together"
     :fee-attributes [["Jan" 8] 99 50 13 38 62]
     :initial-rate 5.5
     :initial-term-label {:bank "Chase" :form "Assisted"}
     :created-at 1504556332211}}])