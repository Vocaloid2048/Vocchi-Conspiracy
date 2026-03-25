package com.voc2048.vocchi_conspiracy.type

data class GameEffect(
    val id: String,
    val name: String,
    val description: String,
    val effectImpl: () -> Unit,
)