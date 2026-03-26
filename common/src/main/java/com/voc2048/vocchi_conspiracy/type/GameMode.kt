package com.voc2048.vocchi_conspiracy.type

import com.voc2048.vocchi_conspiracy.logic.LogicManager
import com.voc2048.vocchi_conspiracy.logic.PlayerData

data class GameMode(
    val id: String,
    val name: String,
    val description: String,
    val missions: List<GameTask>,
    val defaultEffects: List<GameEffect>,
    val minPlayerCount: Int,
    val winCondition: (playerList: List<PlayerData>) -> Boolean,
    val startExecution: (logicManager: LogicManager, playerList: List<PlayerData>) -> Unit,
)