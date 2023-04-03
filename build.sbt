ThisBuild / name := "multimodule_mehul"

ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.10"

lazy val global =project
  .in(file("."))
  //  .settings(settings)
  .aggregate(
    common,
    multi1,
    multi2
  )


lazy val multi1 =project
  .settings(
    name := "multi1"

  )

lazy val multi2 =project
  .settings(
    name := "multi2"

  ).dependsOn(multi1)

lazy val common = project
  .settings(
    name := "common",

  ).dependsOn(multi1,multi2)