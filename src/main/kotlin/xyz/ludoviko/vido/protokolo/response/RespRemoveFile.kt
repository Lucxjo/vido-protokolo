package xyz.ludoviko.vido.protokolo.response

import kotlinx.serialization.Serializable

@Serializable
data class RespRemoveFile(val signature: String, val url: String) : IResp {
    val TYPE = "remove_file_suggestion"
    override fun getType(): String {
        return TYPE
    }
}
