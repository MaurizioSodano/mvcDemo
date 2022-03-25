package com.newco.mvc.gui

import java.awt.event.ActionEvent
import javax.swing.JFrame
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem

class MainFrame : JFrame("Swing Demo") {
    init {
        jMenuBar = createMenu()
        setSize(1000, 800)
        defaultCloseOperation = DISPOSE_ON_CLOSE
        isVisible = true
    }

    private fun createMenu(): JMenuBar {
        val menuBar = JMenuBar()
        val fileMenu = JMenu("File")
        val exitItem = JMenuItem("Exit")
        exitItem.addActionListener { e: ActionEvent? -> System.exit(0) }
        fileMenu.add(exitItem)
        menuBar.add(fileMenu)
        return menuBar
    }
}