package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable

@Serializable
data class RespModMsg(val signature: String, val level: Int, val payload: String, val description: String) : IResp {
    val TYPE = "note"

    override fun getType(): String {
        return TYPE
    }
}
