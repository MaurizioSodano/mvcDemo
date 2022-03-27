package com.newco.mvc.model


import com.newco.application.App
import java.util.*

object Profile {

    fun getProperties(name: String): Properties {
        val props = Properties()

        var env = System.getProperty("env")
        if (env == null) {
            env = "dev"
        }
        val propertiesFile = "/config/$name.$env.properties"
        println("Reading properties from $propertiesFile")
        try {
            props.load(Profile.javaClass.getResourceAsStream(propertiesFile))
        } catch (e: Exception) {
            throw java.lang.RuntimeException("Cannot load properties file: $propertiesFile")

        }
        return props
    }
}