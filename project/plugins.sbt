// addSbtPlugin("com.michaelpollmeier" % "sbt-ci-release" % "0.0.2")
addSbtPlugin("com.michaelpollmeier" % "sbt-ci-release" % "0.0.3-SNAPSHOT")


// addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")
// addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0")
// addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
// addSbtPlugin("io.shiftleft" %% "sbt-jardigests" % "0.1-SNAPSHOT")

resolvers ++= Seq(
  "Artifactory snapshot local" at "https://shiftleft.jfrog.io/shiftleft/libs-snapshot-local",
  "Artifactory release local" at "https://shiftleft.jfrog.io/shiftleft/libs-release-local"
)
