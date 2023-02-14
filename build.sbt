ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.sua"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-fp-simplified",
    idePackagePrefix := Some("com.sua")
  )

lazy val coin_flip = (project in file("./coin_flip/"))
  .settings(
    name := "coin-flip",
    idePackagePrefix := Some("com.sua.coin_flip")
  )

// coin_flip_cats
lazy val coin_flip_cats = (project in file("./coin_flip_cats/"))
  .settings(
    name := "coin-flip-cats",
    idePackagePrefix := Some("com.sua.coin_flip_cats")
  )

// pizza_pos_oop
lazy val pizza_pos_oop = (project in file("./pizza_pos_oop/"))
  .settings(
    name := "pizza_pos_oop",
    idePackagePrefix := Some("com.sua.pizza_pos_oop")
  )
