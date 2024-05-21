ThisBuild / scalaVersion := "2.13.12"

ThisBuild / version := "1.0-SNAPSHOT"

organization := "com.scala_todolist"



lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """Trail and error""",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test,
      "org.postgresql" % "postgresql" % "42.5.4",
      "org.playframework.anorm" %% "anorm" % "2.6.10"
    )
  )
libraryDependencies +=jdbc
//libraryDependencies += "org.postgresql" % "postgresql" % "42.5.4"
//libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.10"


