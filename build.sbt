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

// pizza_pos_fp_modular
lazy val pizza_pos_fp_modular = (project in file("./pizza_pos_fp_modular/"))
  .settings(
    name := "pizza_pos_fp_modular",
    idePackagePrefix := Some("com.sua.pizza_pos_fp_modular")
  )

// pizza_pos_functional_objects
lazy val pizza_pos_functional_objects = (project in file
("./pizza_pos_functional_objects/"))
  .settings(
    name := "pizza_pos_functional_objects",
    idePackagePrefix := Some("com.sua.pizza_pos_functional_objects")
  )

// io_monad
lazy val io_monad = (project in file ("./io_monad/"))
  .settings(
    name := "io_monad",
    idePackagePrefix := Some("com.sua.io_monad")
  )
