package JAVAOOP.lab_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    static double result = 0;

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Label and text field for result, 2 input and button
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setHorizontalAlignment(resultLabel.CENTER);
        JTextField resultField = new JTextField("0");
        resultField.setHorizontalAlignment(resultField.CENTER);
        resultField.setEditable(false);

        JLabel inputLabel1 = new JLabel("First Number:");
        inputLabel1.setHorizontalAlignment(inputLabel1.CENTER);
        JTextField inputTextField1 = new JTextField();
        inputTextField1.setHorizontalAlignment(inputTextField1.CENTER);

        JLabel inputLabel2 = new JLabel("Second Number:");
        inputLabel2.setHorizontalAlignment(inputLabel2.CENTER);
        JTextField inputTextField2 = new JTextField();
        inputTextField2.setHorizontalAlignment(inputTextField2.CENTER);

        JButton addButton = new JButton("+");

        JButton subButton = new JButton("-");

        // Add action listener to add and substract button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNum = Double.parseDouble(inputTextField1.getText());
                double secNum = Double.parseDouble(inputTextField2.getText());
                result = firstNum + secNum;
                resultField.setText(Double.toString(result));
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNum = Double.parseDouble(inputTextField1.getText());
                double secNum = Double.parseDouble(inputTextField2.getText());
                result = firstNum - secNum;
                resultField.setText(Double.toString(result));
            }
        });

        // Add component to panel
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(inputLabel1);
        panel.add(inputTextField1);
        panel.add(inputLabel2);
        panel.add(inputTextField2);
        panel.add(addButton);
        panel.add(subButton);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
