package com.wanna.api.entity

import java.io.Serializable

open class User(
    var id: Int? = null,
    var name: String? = null
) : Serializable {
    constructor() : this(null, null)
}