import scala.io.Source

val bufferedSource = Source.fromFile("data.txt")
val listContents = Source.fromFile("data.txt").mkString.split("/n").toList
println("****************** PRINT LINES IN FILE *************************************")
for (line <- bufferedSource.getLines) {
	println(line)
}
println("################################# EMPTY LINES #####################################")