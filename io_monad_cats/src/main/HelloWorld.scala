import cats.effect.IO
object HelloWorld extends App {
  val hello: IO[Unit] = { println("Hello IO Monad") }

  hello.unsafeRunAsync()
}