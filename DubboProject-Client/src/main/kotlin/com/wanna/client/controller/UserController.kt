package com.wanna.client.controller

import com.wanna.api.entity.User
import com.wanna.api.service.UserService
import org.apache.dubbo.config.annotation.DubboReference
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.TimeUnit
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
class UserController {

    @DubboReference(check = false,interfaceClass = UserService::class)
    private lateinit var userService: UserService

    @RequestMapping("/user")
    fun getUserById(request: HttpServletRequest, response: HttpServletResponse): User {
        response.outputStream.write("wanna".toByteArray())
        response.flushBuffer()
        TimeUnit.SECONDS.sleep(3)
        return userService.getUserById(1)
    }
}