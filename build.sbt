ThisBuild / scalaVersion     := "2.13.14"
ThisBuild / version          := "0.0.2"
ThisBuild / organization     := "com.github.boniface"
ThisBuild / organizationName := "boniface"

ThisBuild / resolvers ++= Seq(
  "Akka library repository".at("https://repo.akka.io/maven"),
  Resolver.jcenterRepo,
)

lazy val akkaGrpcVersion = sys.props.getOrElse("akka-grpc.version", "2.4.3")


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
ThisBuild / versionScheme := Some("early-semver")


libraryDependencies ++= MediaDependencies.all







