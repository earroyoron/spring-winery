package io.earroyoron.winery.services

import io.earroyoron.winery.web.model.CustomerDTO
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
interface CustomerService {
    fun getCustomerById(beerId: UUID): CustomerDTO
    fun save(customer: CustomerDTO): CustomerDTO
    fun delete(customerId: UUID)
}