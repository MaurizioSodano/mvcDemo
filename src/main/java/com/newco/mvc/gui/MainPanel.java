package com.newco.mvc.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel(){
       // setBackground(Color.RED);

        var formLabel=new JLabel("Add User");
        var nameLabel=new JLabel("Name:");
        var passLabel=new JLabel("Password:");

        var nameField=new JTextField();
        var passField=new JTextField();

        var addButton=new JButton("Save");

        setLayout(new BorderLayout());

        add(formLabel,BorderLayout.NORTH);
        add(nameLabel,BorderLayout.CENTER);
    }
}
