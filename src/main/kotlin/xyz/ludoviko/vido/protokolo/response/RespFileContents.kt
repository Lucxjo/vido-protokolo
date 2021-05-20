package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable

@Serializable
data class RespFileContents(var signature: String) : IResp {
    val TYPE = "file_contents"

    override fun getType(): String {
        return TYPE
    }
}