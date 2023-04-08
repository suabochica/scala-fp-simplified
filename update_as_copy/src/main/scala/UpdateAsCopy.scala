package com.sua.update_as_copy

object UpdateAsCopy extends App {
  println("-- Before Copy --")
  val princess = Person("San", "Mononoke")
  println(s"princess = $princess")

  // San got married
  println("-- After Copy --")
  val married = princess.copy(lastName = "Ashitaka")
  println(s"princess = $princess")
  println(s"married = $married")
}

case class Person(firstName: String, lastName: String)