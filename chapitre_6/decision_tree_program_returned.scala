val login = "root"
val password = "Pass123"
val blockResult = if (login == "root") {
	println("You are authorized")
	if (password == "Pass123$") {
		println("Connected !")
	} else {
		println("Not connected !")
	}
} else println("Unauthorized")