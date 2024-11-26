import sbt.Keys.excludeDependencies

ThisBuild / scalaVersion := "2.13.15"
ThisBuild / crossScalaVersions := Seq("2.12.20", "2.13.15")
ThisBuild / version := "0.0.11"
ThisBuild / organization := "com.github.boniface"
ThisBuild / organizationName := "boniface"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / description :=
  "A plugin to share dependencies across multiple projects"
ThisBuild / homepage :=
  Some(url("https://github.com/boniface/hash-media-deps-plugin"))
ThisBuild / resolvers ++= Seq(
  "Akka library repository".at("https://repo.akka.io/maven"),
  Resolver.jcenterRepo,
)
ThisBuild / scmInfo := Some(ScmInfo(
  url("https://github.com/boniface/hash-media-deps-plugin"),
  "scm:git:git@github.com:boniface/hash-media-deps-plugin.git",
))

crossSbtVersions := Seq("2.12.20", "2.13.14")


lazy val dependenciesBundle = (project in file(".")).settings(
  name := "hash-media-deps-plugin",
  libraryDependencies ++= MediaDependencies.all,
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  // Exclude transitive Scala 2.12 dependencies
  excludeDependencies ++= Seq(
    ExclusionRule("org.scala-lang.modules", "scala-collection-compat_2.12"),
    ExclusionRule("org.scala-lang.modules", "scala-xml_2.12"),
  ),
)

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
