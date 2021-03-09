package com.ronaldarias.springboot.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoRestKotlinApplication

fun main(args: Array<String>) {
    runApplication<DemoRestKotlinApplication>(*args)
}
