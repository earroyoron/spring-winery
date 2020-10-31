package io.earroyoron.winery.services

import io.earroyoron.winery.repository.CustomerRepository
import io.earroyoron.winery.web.model.CustomerDTO
import org.springframework.stereotype.Service
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
@Service
class CustomerServiceImpl(private val repo: CustomerRepository) : CustomerService {

    override fun getCustomerById(beerId: UUID): CustomerDTO {
        TODO("Not yet implemented")
    }

    override fun save(customer: CustomerDTO): CustomerDTO {
        TODO("Not yet implemented")
    }

    override fun delete(beerId: UUID) {
        repo.customers.remove(beerId)
    }

}