package com.voc2048.vocchi_conspiracy.type

enum class GameRoleType {
    INNOCENT,
    KILLER,
    OTHER,
}

data class GameRole (
    val id: String,
    val name: String,
    val description: String,
    val roleType: GameRoleType = GameRoleType.INNOCENT,
    val isDumb: Boolean = false,
    val isSan: Boolean = false,
    val colorTag: Int = 0xFFFFFF,
)