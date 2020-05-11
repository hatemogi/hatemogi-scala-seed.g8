import sbt._

object Dependencies {
  val circeVersion = "0.13.0"
  val scalatestVersion = "3.1.1"
  val http4sVersion = "0.21.4"
  val doobieVersion = "0.8.8"

  lazy val baseDependencies = Seq(
    "com.typesafe" % "config" % "1.4.0",
    "org.typelevel" %% "cats-core" % "2.1.1",
    "org.typelevel" %% "cats-effect" % "2.1.3",
    "ch.qos.logback" % "logback-core" % "1.2.3",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "org.slf4j" % "slf4j-api" % "1.7.30",
    "org.slf4j" % "jul-to-slf4j" % "1.7.30",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "org.scalatest" %% "scalatest" % scalatestVersion % Test,
    "org.scalatestplus" %% "scalacheck-1-14" % "3.1.1.1" % Test,
    "org.scalacheck" %% "scalacheck" % "1.14.3" % Test
  )

  val http4sDependencies = Seq(
    "org.http4s" %% "http4s-dsl",
    "org.http4s" %% "http4s-circe",
    "org.http4s" %% "http4s-blaze-server",
    "org.http4s" %% "http4s-blaze-client",
    "org.http4s" %% "http4s-prometheus-metrics"
  ).map(_ % http4sVersion)

  val jsonDependencies = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % circeVersion)

  val databaseDependencies = Seq(
    "mysql" % "mysql-connector-java" % "8.0.19",
    "com.h2database" % "h2" % "1.4.200",
    "org.postgresql" % "postgresql" % "42.2.10",
    "org.tpolecat" %% "doobie-core" % doobieVersion,
    "org.tpolecat" %% "doobie-hikari" % doobieVersion,
    "org.tpolecat" %% "doobie-postgres" % doobieVersion,
    "org.tpolecat" %% "doobie-h2" % doobieVersion,
    "org.tpolecat" %% "doobie-scalatest" % doobieVersion % Test
  )
}