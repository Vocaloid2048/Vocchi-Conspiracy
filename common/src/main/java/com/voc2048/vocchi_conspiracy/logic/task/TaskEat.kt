package com.voc2048.vocchi_conspiracy.logic.task

import com.voc2048.vocchi_conspiracy.logic.role.ROLE_INNOCENT
import com.voc2048.vocchi_conspiracy.type.GameRole
import com.voc2048.vocchi_conspiracy.type.GameRoleType
import com.voc2048.vocchi_conspiracy.type.GameTask

val TASK_EAT = GameTask(
    id = "task_eat",
    name = "logic.task.eat.name",
    description = "logic.task.eat.description",
    roles = listOf(
        ROLE_INNOCENT
    ),
    taskImpl = {
    },
    penaltyImpl = {
    },
)
