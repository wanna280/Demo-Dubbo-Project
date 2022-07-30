package com.wanna.dubbo

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableDubbo  // 等于@DubboComponentScan + @EnableDubboConfig，但是如果导入了starter的话，那么@EnableDubboConfig已经搞定了
@DubboComponentScan
@SpringBootApplication(proxyBeanMethods = false)
open class App

fun main(vararg args: String) {
    val applicationContext = runApplication<App>(*args)
    println(applicationContext)
}