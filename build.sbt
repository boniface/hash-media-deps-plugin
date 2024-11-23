ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "hash-media-deps-plugin",
    idePackagePrefix := Some("com.github.boniface")
  )
