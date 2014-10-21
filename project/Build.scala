import sbt._
import Keys._

object Build extends sbt.Build{

  lazy val proj = Project(
    "WebSockets",
    file("."),
    settings =
      Defaults.defaultSettings ++ Seq(
      organization  := "com.example",
      version       := "0.1",
      scalaVersion  := "2.11.2",

      resolvers ++= Seq(
        "typesafe repo"      at "http://repo.typesafe.com/typesafe/releases/",
        "spray"              at "http://repo.spray.io",
        "spray nightly"      at "http://nightlies.spray.io/"
      ),
      libraryDependencies ++= Seq(
        "io.spray"            %%  "spray-can"     % "1.3.2",
        "com.typesafe.akka"   %%  "akka-actor"    % "2.3.6",
        "com.typesafe.akka"   %%  "akka-testkit"  % "2.3.6" % "test",
        "org.scalatest"       %% "scalatest"      % "2.1.6" % "test"
      )
    )
  )
}