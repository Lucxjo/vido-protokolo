package xyz.ludoviko.vido.protokolo

import kotlinx.serialization.Serializable

@Serializable
data class Artifact(val label: String, val version: String)