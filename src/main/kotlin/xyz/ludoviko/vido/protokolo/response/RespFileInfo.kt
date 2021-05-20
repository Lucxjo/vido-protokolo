package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable


@Serializable
data class RespFileInfo(var signature: String) : IResp {
    val TYPE = "file_info"

    override fun getType(): String {
        return TYPE
    }
}