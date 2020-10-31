package com.erroyoron.brewery.client

import com.erroyoron.brewery.client.dto.WineDto
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Component
import java.util.*

const val BEER_PATH_V1 = "api/v1/wines"

@Component
@ConfigurationProperties("winery", ignoreUnknownFields = false)
class WineClient(restTemplateBuilder: RestTemplateBuilder) {

    lateinit var host: String;

    private val restTemplate = restTemplateBuilder.build()

    fun demandBeer(uuid: UUID): WineDto? {
        return restTemplate.getForObject(
                "$host/$BEER_PATH_V1/$uuid",
                WineDto::class.java)
    }
}