ThisBuild / scalaVersion := "2.12.20"
ThisBuild / version := "0.0.3"
ThisBuild / organization := "com.github.boniface"
ThisBuild / organizationName := "boniface"

ThisBuild / resolvers ++= Seq(
  "Akka library repository".at("https://repo.akka.io/maven"),
  Resolver.jcenterRepo,
)

sbtPlugin := true

name := "hash-media-deps-plugin"

publishMavenStyle := true

publishTo := {
  val ghRepository = "boniface/hash-media-deps-plugin"
  val ghPackages = "https://maven.pkg.github.com/" + ghRepository
  Some("GitHub Package Registry".at(ghPackages))
}

credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "boniface",
  sys.env.getOrElse("GITHUB_TOKEN", ""),
)
ThisBuild / versionScheme := Some("early-semver")

ThisBuild / homepage :=
  Some(url("https://github.com/boniface/hash-media-deps-plugin"))

ThisBuild / licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

ThisBuild / scmInfo := Some(ScmInfo(
  url("https://github.com/boniface/hash-media-deps-plugin"),
  "scm:git:git@github.com:boniface/hash-media-deps-plugin.git",
))

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test


