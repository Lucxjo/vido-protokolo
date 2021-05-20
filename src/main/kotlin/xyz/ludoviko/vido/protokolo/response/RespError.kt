package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class RespError(
    var reportType: String,
    var reportIndex: String,
    var debug: JsonElement
) : IResp {
    val TYPE = "error"

    override fun getType(): String {
        return TYPE
    }
}