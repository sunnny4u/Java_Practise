package com.codespathshala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormOne {
    private JButton btn_msg;
    private JPanel panelMain;

    public FormOne() {
        btn_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormOne");
        frame.setContentPane(new FormOne().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
