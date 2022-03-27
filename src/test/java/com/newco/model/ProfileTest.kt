package com.newco.model

import com.newco.mvc.model.Profile
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class ProfileTest {

    @Test
    fun testLoadDbConfig(){
        val props= Profile.getProperties("db")

        assertNotNull("cannot load db properties",props);

        val dbName=props.getProperty("database")
        assertEquals("dbname incorrect",dbName,"swingdb")
    }
}