package com.voc2048.vocchi_conspiracy.logic

import com.voc2048.vocchi_conspiracy.type.GameMode
import com.voc2048.vocchi_conspiracy.type.GameRole
import java.util.concurrent.ScheduledExecutorService

class LogicManager {
    private var isCurrPlaying: Boolean = true

    private var gameTimer: Int = 0 // in seconds
    private var maxGameTime: Int = 600 // 10 minutes default
    private val schedular: ScheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()

    private val playerManager = PlayerManager()

    fun startGame(gamemode: GameMode) {
        // Prevent starting if already playing
        if (isCurrPlaying) return

        // TODO: Add all players in ready area to manager
        playerManager.clear()
        // addPlayer

        // Start game logic, assign roles, tasks, etc.
        gamemode.startExecution(this, playerManager.getAllPlayers())
        gameTimer = maxGameTime

        // tick start
        tick(gamemode.winCondition)
    }

    fun tick(winCondition: (playerList: List<PlayerData>) -> Boolean) {
        gameTimer--
        if (gameTimer <= 0 || (winCondition(playerManager.getAllPlayers()))) {
            endGame()
        } else {
            schedular.schedule({ tick(winCondition) }, 1, java.util.concurrent.TimeUnit.SECONDS)
        }
    }

    fun assignRoles(roleList: List<Pair<GameRole, Int>>, playerList: List<PlayerData>) {
        // Get playerlist
        val playerList = playerManager.getAllPlayers().toMutableList()

        // Add customized roles to a temporary list based on the provided counts

        // Shuffle and assign
        playerList.shuffle()

    }

    private fun assignTasks() {
        // Assign random tasks to each player
        // TODO: Implement task assignment
    }

    fun endGame() {
        // TODO: Announce winner, reset, etc.
    }

    fun getPlayerManager(): PlayerManager {
        return playerManager
    }

    fun setMaxGameTime(time: Int) {
        maxGameTime = time
    }

    fun getRemainingTime(): Int {
        return gameTimer
    }
}