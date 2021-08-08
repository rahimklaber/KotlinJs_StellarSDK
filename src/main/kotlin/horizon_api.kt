@file:JsNonModule
@file:JsModule("stellar-sdk")

// use this as a namespace
external interface Horizon {

    interface BalanceLine {
        var balance: String
        var asset_type: Any //todo
        var buying_liabilities: String
        var selling_liabilities: String
    }

    interface BalanceLineNative : BalanceLine{
        override var asset_type: Any //todo
    }

    interface BalanceLineAsset<T> : BalanceLine{
        override var asset_type : Any //todo
        var asset_code: String;
        var asset_issuer: String;
        var last_modified_ledger: Int;
        var is_authorized: Int;
        var is_authorized_to_maintain_liabilities: Int;
        var sponsor: String?;
    }

    interface Flags {
        var auth_immutable: Boolean
        var auth_required: Boolean
        var auth_revocable: Boolean
        var auth_clawback_enabled: Boolean
    }

    interface AccountThresholds {
        var low_threshold: Int
        var med_threshold: Int
        var high_threshold: Int
    }

    interface SubmitTransactionResponse {
        var hash: String
        var ledger: Int
        var envelope_xdr: String
        var result_xdr: String
        var result_meta_xdr: String
    }

    interface FeeStatsResponse {
        var last_ledger: String
        var last_ledger_base_fee: String
        var ledger_capacity_usage: String
        var fee_charged: FeeDistribution
        var max_fee: FeeDistribution
    }

    interface FeeDistribution {
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