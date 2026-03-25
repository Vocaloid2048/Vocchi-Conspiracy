package com.voc2048.vocchi_conspiracy.logic

import com.voc2048.vocchi_conspiracy.type.GameRole
import java.util.UUID

data class PlayerData(
    val uuid: UUID,
    val role: GameRole,
    val gameData: GameVaraibles,
)

data class GameVaraibles(
    var isAlive: Boolean = true,
    var isSpectator: Boolean = false,
    var hasWrongKilled: Boolean = false,
    var coins: Int = 0,
    var sanValue: Int = 0,
    var maxSanValue: Int = 100,
)

class PlayerManager {
    private val playerDataMap = mutableMapOf<UUID, PlayerData>()

    fun addPlayer(uuid: UUID, role: GameRole) {
        playerDataMap[uuid] = PlayerData(uuid, role, GameVaraibles())
    }

    fun getPlayerData(uuid: UUID): PlayerData? {
        return playerDataMap[uuid]
    }

    fun removePlayer(uuid: UUID) {
        playerDataMap.remove(uuid)
    }

    fun getAllPlayers(): List<PlayerData> {
        return playerDataMap.values.toList()
    }

    fun clear() {
        playerDataMap.clear()
    }
}