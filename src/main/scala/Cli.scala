object Cli extends App {

   var interpreter = new Interpreter();

   @inline def defined(line: String) = {
     line != null && line.nonEmpty
   }
   Iterator.continually(
      Console.readLine("?> "))
      .takeWhile(defined(_))
      .foreach(line => println(
         interpreter.interpret(line)
      )
   )

}
