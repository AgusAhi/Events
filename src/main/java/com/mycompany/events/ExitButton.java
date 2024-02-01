/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author puntual
 */
public class ExitButton extends JButton implements ActionListener {
    
    public ExitButton(String title) {
        super(title);
        addActionListener(this);
    }
    
    public ExitButton() {
        super();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
}
