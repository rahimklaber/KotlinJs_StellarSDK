@file:JsNonModule
@file:JsModule("stellar-base")

external class Transaction{
    constructor(envelope: String, networkPassphrase: String, withMuxing: Boolean)
//    constructor(envelope: xdr.TransactionEnvelope, networkPassphrase: String, withMuxing: Boolean)
}

external class FeeBumpTransaction{
    constructor(envelope: String, networkPassphrase: String, withMuxing: Boolean)
//    constructor(envelope: xdr.TransactionEnvelope, networkPassphrase: String, withMuxing: Boolean)
}