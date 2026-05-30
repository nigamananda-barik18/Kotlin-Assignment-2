sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}

fun renderUI(state: ScreenState) {
    when (state) {
        is ScreenState.Loading -> println("Loading data...")
        is ScreenState.Success -> println("Success: ${state.data}")
        is ScreenState.Error -> println("Error: ${state.errorMsg}")
    }
}

fun main() {
    val state1: ScreenState = ScreenState.Loading
    val state2: ScreenState = ScreenState.Success("User data loaded")
    val state3: ScreenState = ScreenState.Error("Network failure")

    renderUI(state1)
    renderUI(state2)
    renderUI(state3)
}
