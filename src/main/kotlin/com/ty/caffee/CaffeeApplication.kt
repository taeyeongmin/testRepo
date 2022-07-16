package com.ty.caffee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CaffeeApplication

fun main(args: Array<String>) {
	runApplication<CaffeeApplication>(*args)
}
