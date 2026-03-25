package com.voc2048.vocchi_conspiracy.logic.role

import com.voc2048.vocchi_conspiracy.type.GameRole
import com.voc2048.vocchi_conspiracy.type.GameRoleType

val ROLE_INNOCENT = GameRole(
    id = "role_innocent",
    name = "logic.role.innocent.name",
    description = "logic.role.innocent.description",
    roleType = GameRoleType.INNOCENT,
    isDumb = false,
    isSan = true,
    colorTag = 0xFFFFFF,
)