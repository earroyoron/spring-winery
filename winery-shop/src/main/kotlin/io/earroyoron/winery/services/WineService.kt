package io.earroyoron.winery.services

import io.earroyoron.winery.web.model.WineDto
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
interface WineService {
    fun getWineById(wineId: UUID): WineDto
    fun save(wine: WineDto): WineDto
    fun delete(wineId: UUID)
}