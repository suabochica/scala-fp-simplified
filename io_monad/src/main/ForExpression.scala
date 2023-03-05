
object ForExpression extends App {
  def forExpression: IO[Unit] = for {
    _ <- putStrLn("First name?")
    firstName <- getLine
    _ <- putStrLn("Second name?")
    secondName <- getLine
    firstNameUppercase <- firstName.toUpperCase
    secondNameUppercase <- secondName.toUpperCase
    _ <- putStrLn(s"First: $firstNameUppercase, Last: $secondNameUppercase")
  } yield ()

  forExpression.run
}