package com.newco.mvc.gui;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Swing Demo");

        setJMenuBar(createMenu());
        setSize(1000, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private JMenuBar createMenu() {
        var menuBar = new JMenuBar();
        var fileMenu = new JMenu("File");
        var exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        return menuBar;
    }
}
