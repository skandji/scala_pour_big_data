var intArray = Array(5,7,2,4,13,1,9)
var i = 0
var j = 0
var intElement = 0

// sort Array using bubble sort
while (i < intArray.length) {
	j = intArray.length - 1
	while (j > i) {
		if (intArray(j) < intArray(j - 1)) {
			intElement = intArray(j)
			intArray(j) = intArray(j - 1)
			intArray(j - 1) = intElement
		}
		j = j - 1
	}
	i = i + 1
}

println("Sorted array :")
for (e <- intArray) {
	print(s" $e")
}
println()