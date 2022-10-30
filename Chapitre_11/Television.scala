case class Television (val brand: String, val screenSize: Int, val screenStatus: Boolean, val power: PowerSupply) {

}

class PowerSupply(val voltage: Int, val current: Int, val frequency: Int)