package io.earroyoron.winery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WineryApplication

fun main(args: Array<String>) {
	runApplication<WineryApplication>(*args)
}
