name := "ci-plugin-usage"
organization := "com.michaelpollmeier"

scalaVersion := "2.12.6"
crossScalaVersions := Seq(scalaVersion.value, "2.11.12" /*, "2.13.0-M4"*/ )
libraryDependencies ++= Seq(
  // "io.shiftleft" % "common" % "0.0.0-SNAPSHOT",
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

resolvers ++= Seq(
  Resolver.mavenLocal,
  "Artifactory snapshot local" at "https://shiftleft.jfrog.io/shiftleft/libs-snapshot-local",
  "Artifactory release local" at "https://shiftleft.jfrog.io/shiftleft/libs-release-local",
  "Apache public" at "https://repository.apache.org/content/groups/public/",
  "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/public",
  "Bedatadriven for SOOT dependencies" at "https://nexus.bedatadriven.com/content/groups/public"
)

// publishTo := sonatypePublishTo.value
publishTo := {
  val jfrog = "https://shiftleft.jfrog.io/shiftleft/"
  val buildTimestampSuffix = ";build.timestamp=" + new java.util.Date().getTime
  if (version.value.endsWith("-SNAPSHOT")) {
    Some("snapshots" at jfrog + "libs-snapshot-local" + buildTimestampSuffix)
  } else {
    Some("releases"  at jfrog + "libs-release-local")
  }
}
