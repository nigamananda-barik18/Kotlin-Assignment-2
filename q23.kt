import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun fetchUserData(): String {
    delay(1000)
    return "Alice"
}

suspend fun fetchAppConfig(): String {
    delay(2000)
    return "Dark Mode"
}

fun main() = runBlocking {

    val time = measureTimeMillis {

        val userDeferred = async { fetchUserData() }
        val configDeferred = async { fetchAppConfig() }

        val user = userDeferred.await()
        val config = configDeferred.await()

        println(user)
        println(config)
    }

    println("Total time: ${time}ms")
}
