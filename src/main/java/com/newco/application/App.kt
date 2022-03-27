package com.newco.application

import com.newco.mvc.controller.Controller
import javax.swing.SwingUtilities

object App {
    @JvmStatic
    fun main(args: Array<String>) {
        SwingUtilities.invokeLater { Controller() }
    }
}