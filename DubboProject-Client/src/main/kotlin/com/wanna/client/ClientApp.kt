package com.wanna.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class App

fun main(vararg args:String) {
    runApplication<App>(*args)
}