import scala.annotation.tailrec
def factorial(num: Int): Int = {
	@tailrec
	def fact(num: Int, acc: Int): Int = {
		if (num == 0) acc
		else fact(num - 1, num * acc)
	}
	
	fact(num, 1)
}