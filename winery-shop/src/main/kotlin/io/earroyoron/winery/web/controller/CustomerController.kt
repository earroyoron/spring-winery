package io.earroyoron.winery.web.controller

import com.sun.net.httpserver.Headers
import io.earroyoron.winery.services.CustomerService
import io.earroyoron.winery.web.model.CustomerDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/customers")
@RestController
class CustomerController(private val customerService: CustomerService) {

    @GetMapping("/{customerId}")
    fun getCustomer(@PathVariable(value = "customerId") customerId: UUID): ResponseEntity<CustomerDTO> {
        return ResponseEntity(CustomerDTO(customerId, "no-named"), HttpStatus.OK)
    }

    @PostMapping
    fun createCustomer(@RequestBody customer: CustomerDTO): ResponseEntity<Any> {
        val createdBeer = customerService.save(customer)
        val headers: Headers = Headers()
        headers.add("Location","/api/v1/customers/${createdBeer.id}")
        return ResponseEntity(headers ,HttpStatus.CREATED)
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable(value = "customerId") customerId: UUID) {
        customerService.delete(customerId)
    }

}