package io.earroyoron.winery.web.controller


import io.earroyoron.winery.services.WineService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import java.util.*

@WebMvcTest(WinesController::class)
internal class WinesControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var wineService: WineService

    @Test
    fun shouldGetWines() {
        val uuid = UUID.randomUUID()
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/wines/$uuid"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful)
    }


}