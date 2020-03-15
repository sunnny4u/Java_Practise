package com.codespathshala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentInfo {
    private JPanel panelMain;
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JLabel title;
    private JPanel panelLabel;
    private JPanel panelInputbox;
    private JTable table1;
    private JLabel labelName;
    private JLabel labelID;
    private JLabel labelCourse;
    private JTextField fieldName;
    private JTextField fieldId;
    private JTextField fieldCourse;
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnDelete;
    Connection con1;
    PreparedStatement insert;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Record");
        frame.setContentPane(new studentInfo().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public studentInfo(){
        String name = fieldName.getText();
        int id = Integer.parseInt(fieldId.getText());
        String courseName = fieldCourse.getText();
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
