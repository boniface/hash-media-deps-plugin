import sbt.*

object MediaDependencies {

  private val TestScope = Test

  object Circe {
    private val circeCore = "io.circe" %% "circe-core" % Version.circe
    private val circeGeneric = "io.circe" %% "circe-generic" % Version.circe
    private val circeParser = "io.circe" %% "circe-parser" % Version.circe
    val all: Seq[ModuleID] = Seq(circeCore, circeGeneric, circeParser)
  }

  object Zio {
    private val zioCore = "dev.zio" %% "zio" % Version.zio
    private val zioMacros = "dev.zio" %% "zio-macros" % Version.zio
    private val zioHttp = "dev.zio" %% "zio-http" % Version.zioHttp
    val all: Seq[ModuleID] = Seq(zioCore, zioHttp, zioMacros)
  }

  object ScalaTest {
    private val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest %
      TestScope
    private val scalaCheck = "org.scalacheck" %% "scalacheck" %
      Version.scalaCheck % TestScope
    private val logback = "ch.qos.logback" % "logback-classic" %
      Version.logbackV % TestScope
    private val mockitoScala = "org.mockito" %% "mockito-scala" %
      Version.mockitoScala % TestScope
    private val mockitoScalaTest = "org.mockito" %% "mockito-scala-scalatest" %
      Version.mockitoScala % TestScope

    val all: Seq[ModuleID] =
      Seq(scalaTest, scalaCheck, logback, mockitoScala, mockitoScalaTest)
  }

  object ZioTest {
    private val zioTest = "dev.zio" %% "zio-test" % Version.zio % TestScope
    private val zioTestSbt = "dev.zio" %% "zio-test-sbt" % Version.zio %
      TestScope
    private val zioMagnolia = "dev.zio" %% "zio-test-magnolia" % Version.zio %
      TestScope
    private val zioHttpTestKit = "dev.zio" %% "zio-http-testkit" %
      Version.zioHttp % TestScope
    val all: Seq[ModuleID] =
      Seq(zioTest, zioTestSbt, zioHttpTestKit, zioMagnolia)
  }

  object TestContainers {
    private val scalaTest = "com.dimafeng" %% "testcontainers-scala-scalatest" %
      Version.testContainers % TestScope
    private val cassandra = "com.dimafeng" %% "testcontainers-scala-cassandra" %
      Version.testContainers % TestScope
    private val kafka = "com.dimafeng" %% "testcontainers-scala-kafka" %
      Version.testContainers % TestScope
    private val cockroachdb = "com.dimafeng" %%
      "testcontainers-scala-cockroachdb" % Version.testContainers % TestScope
    private val redis = "com.dimafeng" %% "testcontainers-scala-redis" %
      Version.testContainers % TestScope
    val all: Seq[ModuleID] = Seq(scalaTest, cassandra, kafka, cockroachdb, redis)
  }

  object Airframe {
    private val airframeLog = "org.wvlet.airframe" %% "airframe-log" %
      Version.airframeVersion
    private val airframeULid = "org.wvlet.airframe" %% "airframe-ulid" %
      Version.airframeVersion
    val all: Seq[ModuleID] = Seq(airframeLog, airframeULid)
  }

  object Logging {
    private val logback = "ch.qos.logback" % "logback-classic" %
      Version.logbackV
    private val julToSl4j = "org.slf4j" % "jul-to-slf4j" % Version.julToSl4j
    private val logstashEncoder = "net.logstash.logback" %
      "logstash-logback-encoder" % Version.logstash
    private val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" %
      Version.scalaLogging
    private val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % Version.akka

    val all: Seq[ModuleID] =
      Seq(logback, logstashEncoder, julToSl4j, scalaLogging)
  }

  object Cassandra {
    private val core = "org.apache.cassandra" % "java-driver-core" %
      Version.cassandra
    private val queryBuilder = "org.apache.cassandra" %
      "java-driver-query-builder" % Version.cassandra
    private val alpakka = "com.lightbend.akka" %%
      "akka-stream-alpakka-cassandra" % Version.alpakka
    private val fury = "org.apache.fury" % "fury-core" % Version.fury
    val all: Seq[ModuleID] = Seq(queryBuilder, core, alpakka, fury)
  }

  object PostgresQL {
    private val postgres = "org.postgresql" % "postgresql" % "42.7.4"
    val all: Seq[ModuleID] = Seq(postgres)
  }

  object Chimney {
    private val core = "io.scalaland" %% "chimney" % Version.chimney
    val all: Seq[ModuleID] = Seq(core)
  }

  object Akka {
    private val alpakkaCassandra = "com.lightbend.akka" %%
      "akka-stream-alpakka-cassandra" % Version.alpakka
    private val akkaTyped = "com.typesafe.akka" %% "akka-actor-typed" %
      Version.akka
    private val akkaStreams = "com.typesafe.akka" %% "akka-stream" %
      Version.akka
    private val akkaDiscovery = "com.typesafe.akka" %% "akka-discovery" %
      Version.akka
    private val akkaPki = "com.typesafe.akka" %% "akka-pki" % Version.akka
    private val akkaPersistence = "com.typesafe.akka" %%
      "akka-persistence-typed" % Version.akka
    private val akkSharding = "com.typesafe.akka" %%
      "akka-cluster-sharding-typed" % Version.akka
    private val akkaClusterTyped = "com.typesafe.akka" %% "akka-cluster-typed" %
      Version.akka
    private val akkCluster = "com.typesafe.akka" %% "akka-cluster-tools" %
      Version.akka
    private val akkaPersistenceQuery = "com.typesafe.akka" %%
      "akka-persistence-query" % Version.akka
    private val persistenceCassandra = "com.typesafe.akka" %%
      "akka-persistence-cassandra" % Version.cassandraPersistence
    private val akkPersistenceR2dbc = "com.lightbend.akka" %%
      "akka-persistence-r2dbc" % "1.2.5"
    private val r2dbcPostgres = "org.postgresql" % "r2dbc-postgresql" %
      "1.0.7.RELEASE"
    private val r2dbcSpi = "io.r2dbc" % "r2dbc-spi" % "1.0.0.RELEASE"
    private val r2dbcPool = "io.r2dbc" % "r2dbc-pool" % "1.0.2.RELEASE"
    private val k8Discovery = "com.lightbend.akka.discovery" %%
      "akka-discovery-kubernetes-api" % "1.5.3"

    private val akkaManagement = "com.lightbend.akka.management" %%
      "akka-management" % Version.AkkaManagementVersion
    val all: Seq[ModuleID] = Seq(
      alpakkaCassandra,
      akkaTyped,
      akkaStreams,
      akkaDiscovery,
      akkaPki,
      akkaPersistence,
      akkSharding,
      akkaPersistenceQuery,
      persistenceCassandra,
      akkaManagement,
      akkPersistenceR2dbc,
      r2dbcPostgres,
      r2dbcSpi,
      r2dbcPool,
      akkCluster,
      akkaClusterTyped,
      k8Discovery,
    )
  }

  object AkkaProjection {
    private val akkaProjection = "com.lightbend.akka" %%
      "akka-projection-core" % Version.akkaProjection
    private val akkaProjectionDurableState = "com.lightbend.akka" %%
      "akka-projection-durable-state" % Version.akkaProjection
    private val eventSourced = "com.lightbend.akka" %%
      "akka-projection-eventsourced" % Version.akkaProjection
    private val durableState = "com.lightbend.akka" %%
      "akka-projection-durable-state" % Version.akkaProjection
    private val cassandraProject = "com.lightbend.akka" %%
      "akka-projection-cassandra" % Version.akkaProjection
    val all: Seq[ModuleID] = Seq(
      akkaProjection,
      akkaProjectionDurableState,
      eventSourced,
      durableState,
      cassandraProject,
    )
  }

  object AkkaHttp {
    private val akkaHttp = "com.typesafe.akka" %% "akka-http" % Version.akkaHttp
    private val core = "com.typesafe.akka" %% "akka-http-core" %
      Version.akkaHttp
    private val jwt = "com.typesafe.akka" %% "akka-http-jwt" % Version.akkaHttp
    private val logback = "ch.qos.logback" % "logback-classic" %
      Version.logbackV

    val all: Seq[ModuleID] = Seq(akkaHttp, jwt, core, logback)
  }

  object AkkaTestKit {
    private val akkaTestKit = "com.typesafe.akka" %%
      "akka-actor-testkit-typed" % Version.akka % TestScope
    private val akkaStreamTestKit = "com.typesafe.akka" %%
      "akka-stream-testkit" % Version.akka % TestScope
    private val akkaPersistenceTestKit = "com.typesafe.akka" %%
      "akka-persistence-testkit" % Version.akka % TestScope
    private val akkaHttpTestKit = "com.typesafe.akka" %% "akka-http-testkit" %
      Version.akkaHttp % TestScope
    val all: Seq[ModuleID] = Seq(
      akkaTestKit,
      akkaStreamTestKit,
      akkaPersistenceTestKit,
      akkaHttpTestKit,
    )
  }

  object TapirHttp4s {
    private val tapirCore = "com.softwaremill.sttp.tapir" %% "tapir-core" %
      Version.tapirVersion
    private val tapirHttp4sServer = "com.softwaremill.sttp.tapir" %%
      "tapir-http4s-server" % Version.tapirVersion
    private val tapirHttp4sServerZio = "com.softwaremill.sttp.tapir" %%
      "tapir-http4s-server-zio" % Version.tapirVersion
    private val tapirOpenApiDocs = "com.softwaremill.sttp.tapir" %%
      "tapir-openapi-docs" % Version.tapirVersion
    private val tapirPrometheusMetrics = "com.softwaremill.sttp.tapir" %%
      "tapir-prometheus-metrics" % Version.tapirVersion
    private val tapirSwaggerUiBundle = "com.softwaremill.sttp.tapir" %%
      "tapir-swagger-ui-bundle" % Version.tapirVersion
    private val tapirJsonCirce = "com.softwaremill.sttp.tapir" %%
      "tapir-json-circe" % Version.tapirVersion
    private val emberServer = "org.http4s" %% "http4s-ember-server" % "0.23.28"
    val all: Seq[ModuleID] = Seq(
      tapirCore,
      tapirHttp4sServer,
      tapirHttp4sServerZio,
      tapirOpenApiDocs,
      tapirPrometheusMetrics,
      tapirSwaggerUiBundle,
      tapirJsonCirce,
      emberServer,
    )
  }

  object TapirTest {
    private val tapirSttpStubServer = "com.softwaremill.sttp.tapir" %%
      "tapir-sttp-stub-server" % Version.tapirVersion % TestScope
    private val tapirSttpClient = "com.softwaremill.sttp.client3" %% "circe" %
      "3.10.1" % TestScope
    val all: Seq[ModuleID] = Seq(tapirSttpStubServer, tapirSttpClient)
  }

  object Grpc {
    private val grpcNetty = "io.grpc" % "grpc-netty" % Version.gRPC
    private val grpcStub = "io.grpc" % "grpc-stub" % Version.gRPC
    private val grpcProtobuf = "io.grpc" % "grpc-protobuf" % Version.gRPC
    private val grpcServices = "io.grpc" % "grpc-services" % Version.gRPC
    private val grpcCommonProto = "com.google.protobuf" % "protobuf-java" %
      Version.googleProto
    private val akkaRuntime = "com.lightbend.akka.grpc" %% "akka-grpc-runtime" %
      Version.akkaGrpc
    val all: Seq[ModuleID] = Seq(
      grpcNetty,
      grpcStub,
      grpcProtobuf,
      grpcServices,
      grpcCommonProto,
      akkaRuntime,
    )
  }

  object JsoupRomeFeed {
    val jsoup = "org.jsoup" % "jsoup" % Version.jsoupV
    val romeTools = "com.rometools" % "rome" % Version.romeToolsV
    val all: Seq[ModuleID] = Seq(jsoup, romeTools)
  }

  object Version {
    val jsoupV = "1.18.1"
    val romeToolsV = "2.1.0"
    val circe = "0.14.10"
    val scalaTest = "3.2.19"
    val scalaCheck = "1.18.1"
    val zio = "2.1.13"
    val zioHttp = "3.0.1"
    val cassandra = "4.18.1"
    val testContainers = "0.41.4"
    val logbackV = "1.5.12"
    val alpakka = "8.0.0"
    val fury = "0.9.0"
    val akka = "2.9.5"
    val akkaHttp = "10.6.3"
    val gRPC = "1.68.1"
    val googleProto = "4.28.3"
    val chimney = "1.5.0"
    val airframeVersion = "24.11.0"
    val mockito = "5.14.2"
    val mockitoScala = "1.17.37"
    val cassandraPersistence = "1.2.1"
    val akkaProjection = "1.5.4"
    val logstash = "8.0"
    val julToSl4j = "2.0.16"
    val scalaLogging = "3.9.5"
    val AkkaManagementVersion = "1.5.2"
    val akkaGrpc = "2.4.3"
    val tapirVersion = "1.11.9"
  }
  val all: Seq[ModuleID] = Circe.all ++ Zio.all ++ ScalaTest.all ++
    ZioTest.all ++ TestContainers.all ++ Airframe.all ++ Logging.all ++
    Cassandra.all ++ PostgresQL.all ++ Chimney.all ++ Akka.all ++
    AkkaProjection.all ++ AkkaHttp.all ++ AkkaTestKit.all ++ TapirHttp4s.all ++
    TapirTest.all ++ Grpc.all ++ JsoupRomeFeed.all
}
