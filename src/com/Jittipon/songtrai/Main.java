package com.Jittipon.songtrai;

import com.Jittipon.songtrai.helpers.Calculator;
import com.Jittipon.songtrai.helpers.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // สร้าง Frame
        JFrame frame = new JFrame("Harn Gun Jon Jer");
        frame.setSize(640, 480);
        frame.setLayout(null);

        // Input
        JTextField inputTextFiled = new JTextField();
        inputTextFiled.setBounds(20, 20, 550, 50);
        frame.add(inputTextFiled);

        // Output
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20,160,500,60);
        frame.add(outputLabel);

        // Button
        JButton button = new JButton("Calculate");
        button.setBounds(20,100,250,50);
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String inputText = inputTextFiled.getText(); //กำหนดตัวแปรของสิ่งที่เราต้องพิมพ์ลงไป

                        int inputNumber = Integer.parseInt(inputText); // แปลงตัวแปรเป็นเลข

                        String output = Calculator.getDivisibleOutput(inputNumber);

                        outputLabel.setText(output);

                    }
                }
        );
        frame.add(button);

        // แสดง
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

