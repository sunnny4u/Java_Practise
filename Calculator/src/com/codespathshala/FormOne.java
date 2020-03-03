package com.codespathshala;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormOne {
    private JPanel panelMain;
    private JTextField display;
    private JPanel panelLeft;
    private JButton seven;
    private JButton zero;
    private JButton one;
    private JButton four;
    private JButton div;
    private JButton equal;
    private JButton sub;
    private JButton mul;
    private JButton nine;
    private JButton six;
    private JButton three;
    private JButton delete;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton dot;
    private JButton add;
    private JPanel belowPanel;
    private JRadioButton radioButton1;

    public String value = "";
    public double firstValue;
    public double secondValue;
    public double answer;
    public String stringAnswer;
    public int operation;

    public FormOne() {
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "0";
                display.setText(value);
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                secondValue = Double.parseDouble(value);
                if(operation == 1)
                    answer = firstValue + secondValue;
                else if(operation == 2)
                    answer = firstValue - secondValue;
                else if(operation == 3)
                    answer = firstValue * secondValue;
                else if(operation == 4)
                    answer = firstValue / secondValue;
                else
                    display.setText("Error.!");

                stringAnswer = String.valueOf(answer);
                display.setText(stringAnswer);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += ".";
                display.setText(value);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "1";
                display.setText(value);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "2";
                display.setText(value);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "3";
                display.setText(value);
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "4";
                display.setText(value);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "5";
                display.setText(value);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "6";
                display.setText(value);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "7";
                display.setText(value);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "8";
                display.setText(value);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                value += "9";
                display.setText(value);
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                firstValue = Double.parseDouble(value);
                operation = 4;
                display.setText("");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                firstValue = Double.parseDouble(value);
                display.setText("");
                operation = 2;

            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                firstValue = Double.parseDouble(value);
                display.setText("");
                operation = 3;
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = display.getText();
                firstValue = Double.parseDouble(value);
                operation = 1;
                display.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new FormOne().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
