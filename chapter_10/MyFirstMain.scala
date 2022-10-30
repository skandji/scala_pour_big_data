object MyFirstMain {
	def main(args: Array[String]) = {
		printOdd()
	}

	def printOdd() = {
		val listNumbers = (0 to 200).toList
		for (i<-listNumbers) {
			if (i % 2 == 0)
				println(i)
		}
	}
}