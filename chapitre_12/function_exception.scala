import scala.io.StdIn

val inputString: String = StdIn.readLine()

try {
	val inputDouble: Double = inputString.toDouble
	println(s"The double is $inputDouble")
} catch {
	case x:java.lang.NumberFormatException => println("The format of the number is not correct.")
	case _:Throwable => println("Exception error")
}