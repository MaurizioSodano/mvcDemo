package com.newco.mvc.controller

import com.newco.mvc.gui.MainFrame
import com.newco.mvc.gui.MainPanel
import com.newco.mvc.gui.UserFormListener
import com.newco.mvc.model.*
import java.awt.SystemColor.window
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import java.awt.event.WindowEvent.WINDOW_CLOSING
import java.sql.SQLException


class Controller {
    private val mainFrame: MainFrame
    private val mainPanel: MainPanel = MainPanel()

    init {
        val db = Database.instance
        try {
            db.connect(Profile.getProperties("db"))
            println("Connected!")
        } catch (e: SQLException) {
            println("Cannot connect to database.")

        }

        mainPanel.setFormListener(object : UserFormListener {
            override fun formSubmitted(username: String, password: String) {
                val userDao: UserDao = UserDaoImpl()
                println("$username:$password")
                val user= User(username,password)
                userDao.save(user)
            }
        })

        mainFrame = MainFrame()
        mainFrame.contentPane = mainPanel

        mainFrame.addWindowListener(object : WindowAdapter() {
            override fun windowClosing(e: WindowEvent) {
                println("windowClosing:")
                try {
                    db.close()
                } catch (e: SQLException) {
                    e.printStackTrace()
                }
            }
        })
    }
}