package com.newco.mvc.model


class User {
    var id = 0
    var name: String
    var password: String? = null

    constructor(name: String, password:String) {
        this.name = name
        this.password=password
    }

    constructor(id: Int, name: String, password:String) {
        this.id = id
        this.name = name
        this.password=password
    }

    override fun toString(): String {
        return "User(id=$id, name='$name', password=$password)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (id != other.id) return false
        if (name != other.name) return false
        if (password != other.password) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + (password?.hashCode() ?: 0)
        return result
    }


}