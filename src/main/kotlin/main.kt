import kotlinx.coroutines.*

 suspend fun main() {
    val server = Server("https://horizon-testnet.stellar.org")
    println(server.feeStats().then {
        console.log(it)
    })

}
