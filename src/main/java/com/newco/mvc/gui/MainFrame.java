package com.newco.mvc.gui;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        super("Swing Demo");

            setJMenuBar(createMenu());
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JMenuBar createMenu(){
        var menuBar =new JMenuBar();
        var fileMenu=new JMenu("File");
        var exitMenu=new JMenu("Exit");

        fileMenu.add(exitMenu);
        menuBar.add(fileMenu);

        return menuBar;
    }
}
