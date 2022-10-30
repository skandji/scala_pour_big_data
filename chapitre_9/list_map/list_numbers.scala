val listNumbers = List(14,5,7,6,9,11,17,25,36,47,1,45,89)
def testEvenOdd(n: Int): Boolean = n % 2 == 0
val results = listNumbers.map(testEvenOdd)