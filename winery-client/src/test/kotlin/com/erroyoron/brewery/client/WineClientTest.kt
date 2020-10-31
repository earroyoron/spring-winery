package com.erroyoron.brewery.client

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
internal class WineClientTest {

    @Autowired
    lateinit var wineClient: WineClient

    @Test
    fun demandBeer() {
        val wine = wineClient.demandBeer(UUID.randomUUID())
        assertNotNull(wine)
        print(wine)
    }

}