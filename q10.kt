sealed class ScreenState {

    object Loading : ScreenState()

    data class Success(val data: String) : ScreenState()
}

fun main() {
    val state1: ScreenState = ScreenState.Loading
    val state2: ScreenState = ScreenState.Success("Data loaded successfully")

    when (state1) {
        is ScreenState.Loading -> println("Loading...")
        is ScreenState.Success -> println(state1.data)
    }

    when (state2) {
        is ScreenState.Loading -> println("Loading...")
        is ScreenState.Success -> println(state2.data)
    }
}
