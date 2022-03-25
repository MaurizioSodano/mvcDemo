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

        gc.weightx = 1; //gives a weight to distribute the cells

        gc.gridwidth=2; //merges the 2 cells (0,0) and (0,1)
        add(formLabel,gc);

        gc.gridwidth=1;
        gc.gridy++;
        gc.gridx=0;
        gc.anchor=GridBagConstraints.LAST_LINE_END;
        add(nameLabel,gc);

        gc.gridx++;
        gc.anchor=GridBagConstraints.LAST_LINE_START;
        add(nameField,gc);

        gc.gridx=0;
        gc.gridy++;
        gc.anchor=GridBagConstraints.LAST_LINE_END;
        add(passLabel,gc);

        gc.gridx++;
        gc.anchor=GridBagConstraints.LAST_LINE_START;
        add(passField,gc);

        gc.gridy++;
        add(addButton,gc);

    }
}
