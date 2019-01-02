(ns hl-cup.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [hl-cup.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hl-cup started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hl-cup has shut down successfully]=-"))
   :middleware wrap-dev})
