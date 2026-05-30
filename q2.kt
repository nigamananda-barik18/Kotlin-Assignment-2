class Thermostat {
    var temperature: Double = 20.0
        private set

    fun setTemperature(newTemperature: Double) {
        temperature = newTemperature
    }
}

fun main() {
    val thermostat = Thermostat()

    println("Initial Temperature: ${thermostat.temperature}")

    thermostat.setTemperature(25.5)

    println("Updated Temperature: ${thermostat.temperature}")
}
