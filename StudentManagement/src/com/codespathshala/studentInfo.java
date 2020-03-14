package com.codespathshala;

import javax.swing.*;

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Record");
        frame.setContentPane(new studentInfo().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
