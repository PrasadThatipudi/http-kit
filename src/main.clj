(ns main

  (:require
   [org.httpkit.server :as server]
   [hiccup.core :refer [html]]))

(defn page []
  (html
   [:html
    [:body
     [:h1 {:style {:color "rgb(0, 0, 255)"} } "Hello world!"]]]))

(defn handler [_req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page)})

(defn -main []
  (server/run-server handler {:port 8000})
  (println "Server running at http://localhost:8000"))

