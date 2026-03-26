package com.voc2048.vocchi_conspiracy.logic.mode

import com.voc2048.vocchi_conspiracy.logic.role.ROLE_INNOCENT
import com.voc2048.vocchi_conspiracy.logic.role.ROLE_KILLER
import com.voc2048.vocchi_conspiracy.logic.role.ROLE_POLICE
import com.voc2048.vocchi_conspiracy.logic.task.TASK_DRINK
import com.voc2048.vocchi_conspiracy.logic.task.TASK_EAT
import com.voc2048.vocchi_conspiracy.logic.task.TASK_SLEEP
import com.voc2048.vocchi_conspiracy.type.GameMode
import com.voc2048.vocchi_conspiracy.type.GameRoleType

val MODE_WEREWOLF = GameMode(
    id = "mode_werewolf",
    name = "logic.mode.werewolf.name",
    description = "logic.mode.werewolf.description",
    missions = listOf(
        // TODO: Missions for werewolf mode
        // Innocent, Detective: Drink, Eat, Sleep, Study, Relax...
        // Killer: Pretend to be innocent
        // Third-Party will be added in real play, will not be included in default missions
    ),
    defaultEffects = emptyList(),
    minPlayerCount = 5,
    winCondition = { playerList ->
        val aliveKillers = playerList.count { it.role.roleType == GameRoleType.KILLER && it.isAlive }
        val aliveInnocents = playerList.count { it.role.roleType == GameRoleType.INNOCENT && it.isAlive }
        aliveKillers >= aliveInnocents
    },
    startExecution = { logicManager, playerList ->
        // Set Roles Pool with count
        val roleList = mutableListOf(
            // 1 Killer per 5 players, at least 1
            ROLE_KILLER to maxOf(1, playerList.size / 5),
            ROLE_POLICE to maxOf(1, playerList.size / 5),
            ROLE_INNOCENT to -1, // Fill the rest with Innocents
        )

        // Set Task Pool
        val taskList = mutableListOf(
            TASK_EAT,
            TASK_DRINK,
            TASK_SLEEP,
        )

        // Assign roles, room keys
        logicManager.assignRoles(roleList, playerList)
        logicManager.assignRoomKey(playerList)


        //
    },
)