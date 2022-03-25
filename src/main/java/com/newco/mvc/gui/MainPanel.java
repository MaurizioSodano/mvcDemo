package com.newco.mvc.gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        // setBackground(Color.RED);

        var formLabel = new JLabel("Add User");
        formLabel.setFont(new Font("Serif", Font.PLAIN, 30));

        setLayout(new GridBagLayout());

        var gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;

        gc.weighty = 1; //gives a weight to distribute the cells
        add(formLabel, gc);

        gc.gridy++;
        gc.weighty = 1.5;
        gc.anchor = GridBagConstraints.NORTH;
        add(createFormPanel(),gc);



    }

    private JPanel createFormPanel(){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEtchedBorder());
        var nameLabel = new JLabel("Name:");
        var passLabel = new JLabel("Password:");

        var nameField = new JTextField(15);
        var passField = new JTextField(15);
        var addButton = new JButton("Save");
        var rightPad = new Insets(0, 0, 0, 10);
        var zeroInsets=new Insets(0,0,0,0);

        var gc = new GridBagConstraints();

        panel.setLayout(new GridBagLayout());

        gc.gridwidth = 1;
        gc.gridy++;
        gc.gridx = 0;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = rightPad;
        panel.add(nameLabel, gc);


        gc.gridx++;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = zeroInsets;
        panel.add(nameField, gc);

        gc.gridx = 0;
        gc.gridy++;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = rightPad;
        panel.add(passLabel, gc);

        gc.gridx++;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = zeroInsets;
        panel.add(passField, gc);

        gc.gridy++;
        gc.weighty = 30;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        panel.add(addButton, gc);

        return panel;
    }
}
