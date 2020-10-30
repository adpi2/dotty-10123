
lazy val root = project
  .in(file("."))
  .settings(
    scalaVersion := "3.0.0-M1-bin-20201027-b5a1715-NIGHTLY",
    libraryDependencies ++= Seq(
      "com.sksamuel.elastic4s" % "elastic4s-embedded_2.13" % "5.6.11"
    )
  )
