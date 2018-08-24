name := "ci-plugin-usage"
// version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3"
)
scalacOptions ++= Seq("-deprecation", "-feature")

ThisBuild/resolvers ++= Seq(
  Resolver.mavenLocal,
  "Apache public" at "https://repository.apache.org/content/groups/public/",
  "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/public",
  "Bedatadriven for SOOT dependencies" at "https://nexus.bedatadriven.com/content/groups/public"
)
