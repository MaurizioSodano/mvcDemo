package com.newco.mvc.gui

import java.awt.Font
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Insets
import java.awt.event.ActionEvent
import javax.swing.*

class MainPanel : JPanel() {
    private var formListener: UserFormListener? = null

    init {
        // setBackground(Color.RED);
        val formLabel = JLabel("Add User")
        formLabel.font = Font("Serif", Font.PLAIN, 30)
        layout = GridBagLayout()
        val gc = GridBagConstraints()
        gc.gridx = 0
        gc.gridy = 0
        gc.weighty = 1.0 //gives a weight to distribute the cells
        add(formLabel, gc)
        gc.gridy++
        gc.weighty = 1.5
        gc.anchor = GridBagConstraints.NORTH
        add(createFormPanel(), gc)
    }

    fun setFormListener(formListener: UserFormListener) {
        this.formListener = formListener
    }

    private fun createFormPanel(): JPanel {
        val panel = JPanel()
        val padding = 20
        val etchedBorder = BorderFactory.createEtchedBorder()
        val emptyBorder = BorderFactory.createEmptyBorder(padding, padding, padding, padding)
        panel.border = BorderFactory.createCompoundBorder(etchedBorder, emptyBorder)
        val nameLabel = JLabel("Name:")
        val passLabel = JLabel("Password:")
        val nameField = JTextField(15)
        val passField = JTextField(15)
        val addButton = JButton("Save")
        addButton.addActionListener { e: ActionEvent? ->
            val username = nameField.text
            val password = passField.text

            formListener?.formSubmitted(username, password)

        }
        val rightPad = Insets(0, 0, 0, 10)
        val zeroInsets = Insets(0, 0, 0, 0)
        val gc = GridBagConstraints()
        panel.layout = GridBagLayout()
        gc.gridwidth = 1
        gc.gridy++
        gc.gridx = 0
        gc.weighty = 0.1
        gc.anchor = GridBagConstraints.LINE_END
        gc.insets = rightPad
        panel.add(nameLabel, gc)
        gc.gridx++
        gc.weighty = 0.1
        gc.anchor = GridBagConstraints.LINE_START
        gc.insets = zeroInsets
        panel.add(nameField, gc)
        gc.gridx = 0
        gc.gridy++
        gc.weighty = 0.1
        gc.anchor = GridBagConstraints.LINE_END
        gc.insets = rightPad
        panel.add(passLabel, gc)
        gc.gridx++
        gc.weighty = 0.1
        gc.anchor = GridBagConstraints.LINE_START
        gc.insets = zeroInsets
        panel.add(passField, gc)
        gc.gridy++
        gc.weighty = 30.0
        gc.anchor = GridBagConstraints.FIRST_LINE_END
        panel.add(addButton, gc)
        return panel
    }


}