@file:JsNonModule
@file:JsModule("stellar-sdk")

import kotlin.js.Promise


external class Server(horizonUrl : String, opts: Option= definedExternally){
    val serverURL : Any // URI from urijs

     interface Option{
         var allowHttp: Boolean?
         var appName: String?
         var appVersion: String?
     }

    interface Timebounds{
        var minTime : Int
        var maxTime : Int
    }

    interface SubmitTransactionOptions{
        var skipMemoRequiredCheck : Boolean
    }


    fun fetchTimebounds(
        seconds: Number,
        _isRetry: Boolean = definedExternally,
    ) : Promise<Timebounds>

    fun fetchBaseFee() : Promise<Int>

    fun feeStats() : Promise<Horizon.FeeStatsResponse>

    fun submitTransaction(transaction : Transaction, opts : SubmitTransactionOptions = definedExternally) : Promise<Horizon.SubmitTransactionResponse>
    fun submitTransaction(transaction : FeeBumpTransaction, opts : SubmitTransactionOptions = definedExternally) : Promise<Horizon.SubmitTransactionResponse>

    fun accounts()  : AccountCallBuilder


}


