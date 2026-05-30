class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Invalid deposit amount")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()

    account.deposit(1000.0)

    println("Current Balance: ${account.getBalance()}")
}
