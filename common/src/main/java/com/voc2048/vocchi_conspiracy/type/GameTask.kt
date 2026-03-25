package com.voc2048.vocchi_conspiracy.type

data class GameTask(
    val id: String,
    val name: String,
    val description: String,
    val roles: List<GameRole>,
    val taskImpl: () -> Unit,
    val penaltyImpl: () -> Unit,
)