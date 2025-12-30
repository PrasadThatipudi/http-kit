(ns main

  (:require
   [org.httpkit.server :as server]))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello, again</h1>
          <h2>Heading 2</h2>
          <p>This is a paragraph.</p>
          <ul>
            <li>Item 1</li>
            <li>Item 2</li>
            <li>Item 3</li>
          </ul>"})

(defn -main []
  (server/run-server handler {:port 8000})
  (println "Server running at http://localhost:8000"))
