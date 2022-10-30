val nestedLists = List(
List(4,7,3,11,8),
List(87,21,1,0,7),
List(13,5,20,8)
)

for (i<-nestedLists) {
	for (j<-i) {
		println(j)
	}
}