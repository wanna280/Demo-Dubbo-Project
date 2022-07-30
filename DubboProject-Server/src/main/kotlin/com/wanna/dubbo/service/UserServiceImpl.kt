package com.wanna.dubbo.service

import com.wanna.api.entity.User
import com.wanna.api.service.UserService
import org.apache.dubbo.config.annotation.DubboService

/**
 * DubboService，默认情况下会把第一个接口作为Service去进行注册；
 * 当然也可以通过自定义的注解属性(interfaceClass)，去指定要去进行注册的接口...
 */
@DubboService
open class UserServiceImpl : UserService {
    override fun getUserById(id: Int): User {
        return User(id, "wanna")
    }
}