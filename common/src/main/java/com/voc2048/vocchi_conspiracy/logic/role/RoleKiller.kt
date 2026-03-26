package com.voc2048.vocchi_conspiracy.logic.role

import com.voc2048.vocchi_conspiracy.type.GameRole
import com.voc2048.vocchi_conspiracy.type.GameRoleType

val ROLE_KILLER = GameRole(
    id = "role_killer",
    name = "logic.role.killer.name",
    description = "logic.role.killer.description",
    roleType = GameRoleType.KILLER,
    isDumb = false,
    isSan = false,
    colorTag = 0xFF0000,
)
