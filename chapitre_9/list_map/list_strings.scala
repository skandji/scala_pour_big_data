val listStrings = List("Orange", "Magenta", "Red", "Yellow", "Blue", "Pink", "White")
def extractFirstAndLast(s: String): Any = {
	if (s.length > 0) {
		val listChars = List(s(0), s(s.length-1))
		listChars.mkString
	}
}
val newListStrings = listStrings.map(extractFirstAndLast)