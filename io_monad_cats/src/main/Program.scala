import cats.effects.IO

object Program extends App {
  val program: IO[Unit] = for {
    _ <- IO { println("Welcome to Scala! What is your name") }
    name <- IO { scala.io.StdIn.readLine }
    nameUppercase <- name.toUpperCase
    _ <- IO { println(s"Well hello $nameUppercase!") }
  } yield ()

  program.unsafeRunSync()
}
