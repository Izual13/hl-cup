(ns user
  (:require [hl-cup.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [hl-cup.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'hl-cup.core/repl-server))

(defn stop []
  (mount/stop-except #'hl-cup.core/repl-server))

(defn restart []
  (stop)
  (start))


