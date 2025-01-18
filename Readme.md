# Hash Media Dependencies

[![Version](https://img.shields.io/github/v/release/boniface/hash-media-deps-plugin)](https://github.com/boniface/hash-media-deps-plugin/releases)
[![Build Status](https://img.shields.io/github/actions/workflow/status/boniface/hash-media-deps-plugin/build.yml)](https://github.com/boniface/hash-media-deps-plugin/actions)
[![License](https://img.shields.io/github/license/boniface/hash-media-deps-plugin)](LICENSE)



## Overview

The `hash-media-deps-plugin` is an SBT plugin designed to manage and streamline the dependencies 
for media-related projects. It provides a centralized way to define and manage dependencies, 
ensuring consistency and ease of maintenance.

## Features

- Centralized dependency management
- Supports various libraries and frameworks such as Akka, Tapir, ZIO, and more
- Simplifies the process of adding and updating dependencies


## Usage

In your `build.sbt` file, you can reference the dependencies provided by the plugin:

```scala
ThisBuild / resolvers ++= Seq(
  "Akka library repository".at("https://repo.akka.io/maven"),
  "GitHub Package Registry" at ("https://maven.pkg.github.com/boniface/hash-media-deps-plugin"),
  Resolver.jcenterRepo,
)

lazy val root = (project in file("."))
  .settings(
    name := "project-name",
    libraryDependencies += "com.github.boniface" %% "hash-media-deps-plugin" % "x.y.z",
  )
```

## Dependencies

The plugin includes a variety of dependencies, organized into different categories such as Akka, Tapir, ZIO, and more. Here are some examples:

- **Akka**:
  - `akka-actor-typed`
  - `akka-cluster-sharding-typed`
  - `akka-cluster-tools`
  - `akka-cluster-typed`
  - `akka-discovery`
  - `akka-discovery-kubernetes-api`
  - `akka-http`
  - `akka-http-core`
  - `akka-http-jwt`
  - `akka-http-testkit`
  - `akka-management`
  - `akka-persistence-cassandra`
  - `akka-persistence-query`
  - `akka-persistence-r2dbc`
  - `akka-persistence-testkit`
  - `akka-persistence-typed`
  - `akka-projection-cassandra`
  - `akka-projection-core`
  - `akka-projection-durable-state`
  - `akka-projection-eventsourced`
  - `akka-slf4j`
  - `akka-stream`
  - `akka-stream-alpakka-cassandra`
  - `akka-stream-testkit`
  - `akka-testkit`
  - `r2dbc-pool`
  - `r2dbc-postgresql`
  - `r2dbc-spi`

- **Airframe**:
  - `airframe-log`
  - `airframe-ulid`

- **Cassandra**:
  - `akka-stream-alpakka-cassandra`
  - `fury-core`
  - `java-driver-core`
  - `java-driver-query-builder`

- **Chimney**:
  - `chimney`

- **Circe**:
  - `circe-core`
  - `circe-generic`
  - `circe-parser`

- **Grpc**:
  - `akka-grpc-runtime`
  - `grpc-netty`
  - `grpc-protobuf`
  - `grpc-services`
  - `grpc-stub`
  - `protobuf-java`

- **JsoupRomeFeed**:
  - `jsoup`
  - `rome`

- **Logging**:
  - `akka-slf4j`
  - `jul-to-slf4j`
  - `logback-classic`
  - `logstash-logback-encoder`
  - `scala-logging`

- **PostgresQL**:
  - `postgresql`

- **ScalaTest**:
  - `logback-classic`
  - `mockito-scala`
  - `mockito-scala-scalatest`
  - `scalacheck`
  - `scalatest`

- **TapirHttp4s**:
  - `http4s-ember-server`
  - `tapir-core`
  - `tapir-http4s-server`
  - `tapir-http4s-server-zio`
  - `tapir-json-circe`
  - `tapir-openapi-docs`
  - `tapir-prometheus-metrics`
  - `tapir-swagger-ui-bundle`

- **TapirTest**:
  - `tapir-sttp-stub-server`
  - `tapir-sttp-client`

- **TestContainers**:
  - `testcontainers-scala-cassandra`
  - `testcontainers-scala-cockroachdb`
  - `testcontainers-scala-kafka`
  - `testcontainers-scala-redis`
  - `testcontainers-scala-scalatest`

- **Zio**:
  - `zio`
  - `zio-http`
  - `zio-macros`

- **ZioTest**:
  - `zio-http-testkit`
  - `zio-test`
  - `zio-test-magnolia`
  - `zio-test-sbt`

## Contributing

Contributions, well... nothing much actually, but they are welcome, anyway! Please open an issue or submit a pull request on GitHub.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
```