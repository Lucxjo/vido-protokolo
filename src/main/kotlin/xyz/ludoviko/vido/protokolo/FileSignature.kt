package xyz.ludoviko.vido.protokolo

import kotlinx.serialization.Serializable

@Serializable
data class FileSignature(val signature: String, val filename: String)