var aList = List(4,7,9,2,5,11,14,3,8,10)
var bList = List(3,17,15,6,7,10,17,19,20)

def appendAnElement(a: Int): List[Int] = {
	val lBuffer = aList.toBuffer
	lBuffer.append(a)
	lBuffer.toList
}

// Append an element to the list aList
aList = appendAnElement(25)

// Union of two lists
val unionList = aList.union(bList)
if (aList == unionList) println("The union operation change the original list.")
else println("The union operation return a new instance.")

// Intersection of two lists
val intersectList = aList.intersect(bList)
if (aList == intersectList) println("The intersection operation change the original list.")
else println("The intersection operation return a new instance.")