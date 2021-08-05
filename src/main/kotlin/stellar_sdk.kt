@file:JsNonModule
@file:JsModule("stellar-sdk")

import kotlin.js.Promise


external class Server(horizonUrl : String, opts: Option= definedExternally){
    val serverURL : Any // URI from urijs

     class Option(allowHttp: Boolean?,
                  appName: String?,
                  appVersion: String?)

    interface Timebounds{
        var minTime : Int
        var maxTime : Int
    }

    class SubmitTransactionOptions{
        var skipMemoRequiredCheck : Boolean
    }


    fun fetchTimeBounds(
        seconds: Number,
        _isRetry: Boolean = definedExternally,
    ) : Promise<Timebounds>

    fun fetchBaseFee() : Promise<Int>

    fun feeStats() : Promise<Horizon.FeeStatsResponse>

    fun submitTransaction(transaction : Transaction, opts : SubmitTransactionOptions = definedExternally) : Promise<Horizon.SubmitTransactionResponse>
    fun submitTransaction(transaction : FeeBumpTransaction, opts : SubmitTransactionOptions = definedExternally) : Promise<Horizon.SubmitTransactionResponse>



}
// use this as a namespace
external interface Horizon{
    interface SubmitTransactionResponse{
        var hash : String
        var ledger : Int
        var envelope_xdr : String
        var result_xdr : String
        var result_meta_xdr : String
    }

    interface FeeStatsResponse{
        var last_ledger : String
        var last_ledger_base_fee : String
        var ledger_capacity_usage : String
        var fee_charged: FeeDistribution
        var max_fee : FeeDistribution
    }

    interface FeeDistribution{
        var max: String
        var min: String
        var mode: String
        var p10: String
        var p20: String
        var p30: String
        var p40: String
        var p50: String
        var p60: String
        var p70: String
        var p80: String
        var p90: String
        var p95: String
        var p99: String
    }
}