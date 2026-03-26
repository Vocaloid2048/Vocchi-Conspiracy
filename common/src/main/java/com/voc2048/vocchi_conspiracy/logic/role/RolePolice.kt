package com.voc2048.vocchi_conspiracy.logic.role

import com.voc2048.vocchi_conspiracy.type.GameRole
import com.voc2048.vocchi_conspiracy.type.GameRoleType

val ROLE_POLICE = GameRole(
    id = "role_police",
    name = "logic.role.police.name",
    description = "logic.role.police.description",
    roleType = GameRoleType.INNOCENT,
    isDumb = false,
    isSan = true,
    colorTag = 0x0000FF,
)