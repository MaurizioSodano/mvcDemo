package com.newco.mvc.controller;

import com.newco.mvc.gui.MainFrame;
import com.newco.mvc.gui.MainPanel;

public class Controller {
    private MainFrame mainFrame;

    private MainPanel mainPanel;

    public Controller() {
        mainPanel=new MainPanel();
        mainFrame = new MainFrame();

        mainFrame.setContentPane(mainPanel);

    }
}
