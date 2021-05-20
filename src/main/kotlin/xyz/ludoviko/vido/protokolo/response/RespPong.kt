package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable

@Serializable
data class RespPong(val payload: String) : IResp {
    val TYPE = "pong"
    override fun getType(): String {
        return TYPE
    }
}
