package com.erroyoron.brewery.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WineClientApplication

fun main(args: Array<String>) {
	runApplication<WineClientApplication>(*args)
}
