package io.earroyoron.winery.web.model

import java.util.UUID

class WineDto(
        val id: UUID,
        val wineName: String,
        val wineStyle: String,
        val graduation: Long = 10L
)
