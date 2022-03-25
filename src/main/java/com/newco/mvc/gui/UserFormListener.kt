package com.newco.mvc.gui

interface UserFormListener {
    fun formSubmitted(username: String, password: String)
}