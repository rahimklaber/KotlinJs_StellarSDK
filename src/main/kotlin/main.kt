import kotlinx.coroutines.*

 suspend fun main() {
    val server = Server("https://horizon-testnet.stellar.org")
//    println(server.fetchTimebounds(10).then {
//        console.log(it)
//    })

     val res = server.accounts().accountId("GCCILFMMNISMQAH4SK57MDWI7SIFZPSIPLBRU3QGIVKV6ACYOZIOXM7K").call()
         .await()
     println(res.data_attr.)
     console.log(res.data_attr)
 }
