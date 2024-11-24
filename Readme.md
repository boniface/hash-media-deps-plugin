Sure, here is the updated `README.md` file with badges for version, build status, and license:


# Hash Media Deps Plugin

[![Version](https://img.shields.io/github/v/release/boniface/hash-media-deps-plugin)](https://github.com/boniface/hash-media-deps-plugin/releases)
[![Build Status](https://img.shields.io/github/actions/workflow/status/boniface/hash-media-deps-plugin/build.yml)](https://github.com/boniface/hash-media-deps-plugin/actions)
[![License](https://img.shields.io/github/license/boniface/hash-media-deps-plugin)](LICENSE)



## Overview

The `hash-media-deps-plugin` is an SBT plugin designed to manage and streamline the dependencies for media-related projects. It provides a centralized way to define and manage dependencies, ensuring consistency and ease of maintenance.

## Features

- Centralized dependency management
- Supports various libraries and frameworks such as Akka, Tapir, ZIO, and more
- Simplifies the process of adding and updating dependencies

## Installation

To use the `hash-media-deps-plugin`, add the following to your `project/plugins.sbt` file:

```scala
addSbtPlugin("com.github.boniface" % "hash-media-deps-plugin" % "0.0.2")
```

## Usage

In your `build.sbt` file, you can reference the dependencies provided by the plugin:

```scala
libraryDependencies ++= MediaDependencies.all
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

## Configuration

Ensure that your `build.sbt` file is correctly set up to use the plugin and its dependencies. Here is an example configuration:

```scala
ThisBuild / scalaVersion     := "2.13.15"
ThisBuild / version          := "0.0.1"
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

ThisBuild / versionScheme := Some("early-semver")

libraryDependencies ++= MediaDependencies.all
```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request on GitHub.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
```