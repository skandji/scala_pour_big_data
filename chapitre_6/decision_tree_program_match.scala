val login = "root"
val password = "Pass123"
login match {
	case "root" => if (password == "Pass123$") println("Connected") else println("Not connected")
	case _ => println("Unauthorized")
}