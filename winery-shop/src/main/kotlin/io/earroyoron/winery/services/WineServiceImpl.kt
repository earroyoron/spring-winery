package io.earroyoron.winery.services

import io.earroyoron.winery.repository.WineRepository
import io.earroyoron.winery.web.model.WineDto
import org.springframework.stereotype.Service
import java.util.*


@Service
class WineServiceImpl(private val repo: WineRepository) : WineService {

    override fun getWineById(wineId: UUID): WineDto {
        return repo.wines.getOrElse(wineId) {
            WineDto(UUID.randomUUID(),
                    "Arzuaga","Tinto",5L)
        }
    }

    override fun save(wine: WineDto): WineDto {
        repo.wines.putIfAbsent(wine.id, wine)
        return wine
    }

    override fun delete(wineId: UUID) {
        repo.wines.remove(wineId)
    }

}