import scala.io.Source

val bufferedSource = Source.fromFile("data.txt")
val keyWord = "Ba"
var i = 0
for (line <- bufferedSource.getLines) {
	println(line.toString)
	if (keyWord == line | line.toString.contains(keyWord)) i+=1
}
println(s"The term $keyWord appears $i times in the file.")