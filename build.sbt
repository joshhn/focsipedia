lazy val focs = project
  .in(file("focs"))
  .settings(
    name := "focs",
    scalaVersion := "2.12.11",
  )

lazy val docs = project
  .in(file("focs-docs"))
  .settings(
    moduleName := "focs-docs",
  )
  .dependsOn(focs)
  .enablePlugins(MdocPlugin, DocusaurusPlugin)
