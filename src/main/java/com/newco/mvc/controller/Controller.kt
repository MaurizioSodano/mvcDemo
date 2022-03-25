package com.newco.mvc.controller

import com.newco.mvc.gui.MainFrame
import com.newco.mvc.gui.MainPanel
import com.newco.mvc.gui.UserFormListener

class Controller {
    private val mainFrame: MainFrame
    private val mainPanel: MainPanel = MainPanel()

    init {
        mainPanel.setFormListener(object : UserFormListener {
            override fun formSubmitted(username: String, password: String) {
                println("$username:$password")
            }
        })

        mainFrame = MainFrame()
        mainFrame.contentPane = mainPanel
    }
}