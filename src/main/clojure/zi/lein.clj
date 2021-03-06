(ns zi.lein
  "Leiningen project functions"
  (:require
   [leiningen.core.project :as project]))

(defn paths-for-checkout
  "Return the source paths for a given pom file"
  [project-file]
  (let [project (project/read project-file)]
    (concat
     (:source-paths project ["src"])
     [(:compile-path project ["classes"])]
     (:resource-paths project ["resources"]))))
