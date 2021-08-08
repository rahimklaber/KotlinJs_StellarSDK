@file:JsNonModule
@file:JsModule("stellar-sdk")

import kotlin.js.Promise
//todo does this work?
external class DataOptions(value: String)

external interface ServerApi{
    interface CollectionPage<T>{
        var records : Array<T>
        var next : () -> Promise<CollectionPage<T>>
        var prev : () -> Promise<CollectionPage<T>>
    }
    interface AccountRecord{
        var id: String
        var paging_token: String
        var account_id: String
        var sequence: String
        var subentry_count: Int
        var home_domain: String?
        var inflation_destination: String?
        var last_modified_ledger: Int
        var flags : Horizon.Flags
        var balances : Array<Horizon.BalanceLine>
        var signers : Array<AccountRecordSigners>
        var data : (options : DataOptions) -> Promise<DataOptions>
        var data_attr : Array<Pair<String,String>> // todo
    }
}