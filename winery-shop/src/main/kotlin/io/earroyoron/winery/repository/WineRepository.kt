package io.earroyoron.winery.repository

import io.earroyoron.winery.web.model.WineDto
import org.springframework.stereotype.Repository
import java.util.*


@Repository
class WineRepository {

    val wines = mutableMapOf< UUID, WineDto>()


}