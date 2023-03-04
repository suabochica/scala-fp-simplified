package com.sua.io_monad

object YourName extends App {
  for {
    _ <- putStrLn("First name?")
    firstName <- getLine
    _ <- putStrLn(s"Last name?")
    lastName <- getLine
    _ <- putStrLn(s"First: $firstName, Last: $lastName")
  } yield ()
}
