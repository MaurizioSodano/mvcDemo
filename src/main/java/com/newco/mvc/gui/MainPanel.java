package com.newco.mvc.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel(){
       // setBackground(Color.RED);

        var formLabel=new JLabel("Add User");
        var nameLabel=new JLabel("Name:");
        var passLabel=new JLabel("Password:");

        var nameField=new JTextField(15);
        var passField=new JTextField(15);
        var addButton=new JButton("Save");

        setLayout(new GridBagLayout());

        var gc=new GridBagConstraints();

        gc.gridx=0;
        gc.gridy=0;
        gc.gridwidth=2;
        add(formLabel,gc);

        gc.gridwidth=1;
        gc.gridy++;
        gc.gridx=0;
        add(nameLabel,gc);

        gc.gridx++;
        add(nameField,gc);

        gc.gridx=0;
        gc.gridy++;
        add(passLabel,gc);

        gc.gridx++;
        add(passField,gc);

        gc.gridy++;
        add(addButton,gc);

    }
}
