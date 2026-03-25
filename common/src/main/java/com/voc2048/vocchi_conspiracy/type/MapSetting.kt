package com.voc2048.vocchi_conspiracy.type


data class MapSettings(
    // Ready Area
    val readyAreaStart : Position,
    val readyAreaEnd : Position,

    // Game Area
    val gameAreaStart : Position,
    val gameAreaEnd : Position,

    // Copy-Structure Area
    val copyStructureAreaStart : Position,
    val copyStructureAreaEnd : Position,

    // Game Start Position
    val gameStartPosition : Position,
    val gameStartRotation : Float
)

data class Position(
    val x: Float,
    val y: Float,
    val z: Float,
)