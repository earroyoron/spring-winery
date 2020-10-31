package io.earroyoron.winery.web.controller

import com.sun.net.httpserver.Headers
import io.earroyoron.winery.services.WineService
import io.earroyoron.winery.web.model.WineDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/wines")
@RestController
class WinesController(private val wineService: WineService) {

    @GetMapping("/{wineId}")
    fun getWine(@PathVariable(value = "wineId") wineId: UUID): ResponseEntity<WineDto> {
        return ResponseEntity(wineService.getWineById(wineId), HttpStatus.OK)
    }

    @PostMapping
    fun createWine(@RequestBody wine: WineDto): ResponseEntity<Any> {
        val createWine = wineService.save(wine)
        val headers: Headers = Headers()
        headers.add("Location","/api/v1/wines/${createWine.id}")
        return ResponseEntity(headers ,HttpStatus.CREATED)
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteWine(@PathVariable(value = "wineId") wineId: UUID) {
        wineService.delete(wineId)
    }

}