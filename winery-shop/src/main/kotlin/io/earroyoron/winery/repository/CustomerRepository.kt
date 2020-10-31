package io.earroyoron.winery.repository

import io.earroyoron.winery.web.model.CustomerDTO
import org.springframework.stereotype.Repository
import java.util.*


@Repository
class CustomerRepository {

    val customers = mutableMapOf< UUID, CustomerDTO>()


}