import java.lang.System._
import java.net.URL

import sbt.Keys._
import sbt._


object build extends Build {

  private val encoding: String = sys.props("file.encoding")
  assert(encoding == "UTF-8", s"File encoding must be UTF-8 but was $encoding")

  val commonScalacOptions = Seq(
    "-target:jvm-1.7",
    "-language:postfixOps", "-language:higherKinds", "-language:implicitConversions",
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture"
  )

  lazy val root = Project("github-integration-template", file(".")).aggregate(library)

  lazy val commonSettings = Seq(
    organization := "com.perevillega",
    version := getProperty("version", "dev.build"),
    scalaVersion := "2.11.7",
    externalResolvers := Seq(Resolver.defaultLocal),
    scalacOptions ++= commonScalacOptions,
    libraryDependencies ++=Seq(
      logback,
      scalaz,
      scalazEffect,
      scalaTest,
      mockito
    )
  )

  lazy val library = Project("library", file("library")).settings(commonSettings ++ Seq(
    name := "sample-lib"
  ))

  val scalazVersion = "7.1.1"

  val logback                     = "ch.qos.logback"                % "logback-classic"                % "1.1.2"
  val scalaz                      = "org.scalaz"                   %% "scalaz-core"                    % scalazVersion
  val scalazEffect                = "org.scalaz"                   %% "scalaz-effect"                  % scalazVersion
  val scalaTest                   = "org.scalatest"                %% "scalatest"                      % "2.2.5"           % "test"
  val mockito                     = "org.mockito"                   % "mockito-core"                   % "1.10.19"         % "test"

}