name := "github-integration-templates"

organization := "com.perevillega"

version := "0.0.1"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.7", "2.10.5")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalacOptions ++= Seq(
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

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "commons-io"      %  "commons-io"       % "2.4",
  "org.mockito"     %  "mockito-core"     % "1.10.19"   % "test",
  "ch.qos.logback"  %  "logback-classic"  % "1.1.2",
  "org.scalaz"      %% "scalaz-core"      % "7.1.1",
  "org.scalaz"      %% "scalaz-effect"    % "7.1.1",
  "org.scalatest"   %% "scalatest"        % "2.2.5"     % "test"
)

publishArtifact in Test := false

parallelExecution in Test := false