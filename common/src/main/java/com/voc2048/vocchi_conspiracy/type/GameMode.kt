package com.voc2048.vocchi_conspiracy.type

data class GameMode(
    val id: String,
    val name: String,
    val description: String,
    val missions: List<GameTask>,
    val defaultEffects: List<GameEffect>
)