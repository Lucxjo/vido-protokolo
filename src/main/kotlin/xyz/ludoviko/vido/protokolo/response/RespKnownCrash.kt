package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable

@Serializable
data class RespKnownCrash(val note: String, val url: String) : IResp {
    val TYPE = "known_crash"
    override fun getType(): String {
        return TYPE
    }
}
