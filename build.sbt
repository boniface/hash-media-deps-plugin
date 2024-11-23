ThisBuild / scalaVersion     := "2.13.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.boniface"
ThisBuild / organizationName := "boniface"


sbtPlugin := true

name := "hash-media-deps-plugin"


publishMavenStyle := true

publishTo := {
  val ghRepository = "boniface/hash-media-deps-plugin"
  val ghPackages = "https://maven.pkg.github.com/" + ghRepository
  Some("GitHub Package Registry" at ghPackages)
}

credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "boniface",
  sys.env.getOrElse("GITHUB_TOKEN", "")
)

