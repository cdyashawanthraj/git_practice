import scala.io.StdIn
import scala.util.Random

@main
def userInput(): Unit ={
//  println("Terminal is waiting for your input")
//  val input = StdIn.readLine()
//  println(input.toInt*10)
  println(Random.nextInt())
  println(Random.nextInt(100))
  println(Random.nextPrintableChar())
  println(Random.nextString(20))
  println("added new line at 13")

  println("welcome Dear user\n can i know your name please:")
  val name = StdIn.readLine()
  println(s"Thanks for provinding the name \n \n welcome  ${name} how can i help you!")


//  println("Can you provide me any number \n so that i can help you in multiplication by 5")
//  val num = StdIn.readLine()
//  println(s"Thanks for providing the number ${name} ")
//  println(s"Please find the result ${num.toInt*5}")

  println(s"${name} can you tell me your birth year:")
  val year = StdIn.readLine()
  println(s"you are ${2025 - year.toInt} years old")
}
