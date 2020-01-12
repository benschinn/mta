(ns mta.core
    (:require
      [reagent.core :as r]))

;; -------------------------
;; Views

(defn home-page []
  [:main
    [:h2 "Ministering to All"]
    [:div 
      [:form
        [:label "First Name"][:br]
        [:input {:type "text"}][:br]
        [:label "Last Name"][:br]
        [:input {:type "text"}][:br]
        [:label "Date"][:br]
        [:input {:type "date"}][:br]
        [:label "Comment"][:br]
        [:textarea {:cols "30" :rows "10"}][:br]
        [:br]
        [:input {:type "button" :value "Add"}]
    ]]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
