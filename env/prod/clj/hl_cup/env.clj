(ns hl-cup.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[hl-cup started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[hl-cup has shut down successfully]=-"))
   :middleware identity})
