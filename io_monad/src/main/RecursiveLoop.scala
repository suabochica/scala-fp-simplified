package com.sua.io_monad

object RecursiveLoop extends App {
  def loop: IO[Unit] = for {
    _ <- putStrLn("Type something: ")
    input <- getLine
    _ <- putStrLn(s"You said '$input'.")
    _ <- if (input == "quit") IO(Unit) else loop
  } yield ()

  loop.run
}