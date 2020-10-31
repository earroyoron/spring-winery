package com.erroyoron.brewery.client.dto

import java.util.*

data class WineDto(
        val id: UUID,
        val wineName: String,
        val wineStyle: String,
        val graduation: Long = 10L
)