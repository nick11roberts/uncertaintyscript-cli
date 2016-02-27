object Cli extends App {
   var interpreter = new Interpreter();
   println(interpreter.interpret("hadamard hadamard qubit q"));
   println(interpreter.interpret("qubit w"));
   println(interpreter.interpret("hadamard paulix w"));
   println(interpreter.interpret("pauliy paulix pauliz q"));
   println(interpreter.interpret("qubit e"));
   println(interpreter.interpret("pauliy e"));
   println(interpreter.interpret("read e"));
   println(interpreter.interpret("read q"));
   println(interpreter.interpret("read qubit ndfgdfg"))
}

