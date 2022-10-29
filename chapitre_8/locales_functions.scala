def calculate(a: Int, b: Int, op: String): Any = {
	op match {
		case "+" => addNumbers(a,b)
		case "-" => substractNumbers(a,b)
		case "*" => multiplifyNumbers(a,b)
		case "/" => divideNumbers(a,b)
		case _ => "No operation available"
	}
}

def addNumbers(a: Int, b: Int): Int = {
	if (a.isValidInt & b.isValidInt)
		a + b
	else 0
}

def substractNumbers(a: Int, b: Int): Int = {
	if (a.isValidInt & b.isValidInt)
		a - b
	else 0
}

def multiplifyNumbers(a: Int, b: Int): Int = {
	if (a.isValidInt & b.isValidInt)
		a * b
	else 0
}

def divideNumbers(a: Int, b: Int): Int = {
	if (a.isValidInt & b.isValidInt & b != 0)
		a / b
	else 0
}