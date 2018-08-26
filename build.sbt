name := "ci-plugin-usage"
organization := "com.michaelpollmeier"

scalaVersion := "2.12.6"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3"
)
scalacOptions ++= Seq("-deprecation", "-feature")

homepage := Some(url("https://github.com/mpollmeier/sbt-ci-release-usage"))
scmInfo := Some(ScmInfo(
    url("https://github.com/mpollmeier/sbt-ci-release-usage"),
    "scm:git@github.com:mpollmeier/sbt-ci-release-usage.git"))

licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(
  Developer(
    "mpollmeier",
    "Michael Pollmeier",
    "michael@michaelpollmeier.com",
    url("https://michaelpollmeier.com")
  )
)
