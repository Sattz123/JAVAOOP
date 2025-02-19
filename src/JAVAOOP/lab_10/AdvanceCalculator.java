package JAVAOOP.lab_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdvanceCalculator {
    static double result = 0;

    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Advance Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Menu
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Mode");
        JMenuItem normalItem = new JMenuItem("Normal");
        JMenuItem scientificItem = new JMenuItem("Scientific");
        menu.add(normalItem);
        menu.add(scientificItem);
        mb.add(menu);
        frame.setJMenuBar(mb);

        // Card layout for normal mode and scientific mode
        JPanel cardPanel = new JPanel(new CardLayout());

        // --------------------Normal mode panel-------------------- //
        JPanel normalPanel = new JPanel();
        normalPanel.setLayout(new GridLayout(5, 2));

        // Label and text field for input
        JLabel norResultLabel = new JLabel("Result:");
        norResultLabel.setHorizontalAlignment(norResultLabel.CENTER);
        JTextField norResultField = new JTextField("0");
        norResultField.setHorizontalAlignment(norResultField.CENTER);
        norResultField.setEditable(false);

        JLabel norInputLabel1 = new JLabel("First Number:");
        norInputLabel1.setHorizontalAlignment(norInputLabel1.CENTER);
        JTextField norInputTextField1 = new JTextField();
        norInputTextField1.setHorizontalAlignment(norInputTextField1.CENTER);

        JLabel norInputLabel2 = new JLabel("Second Number:");
        norInputLabel2.setHorizontalAlignment(norInputLabel2.CENTER);
        JTextField norInputTextField2 = new JTextField();
        norInputTextField2.setHorizontalAlignment(norInputTextField2.CENTER);

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");

        // Add component to normal panel
        normalPanel.add(norResultLabel);
        normalPanel.add(norResultField);
        normalPanel.add(norInputLabel1);
        normalPanel.add(norInputTextField1);
        normalPanel.add(norInputLabel2);
        normalPanel.add(norInputTextField2);
        normalPanel.add(addButton);
        normalPanel.add(subButton);
        normalPanel.add(mulButton);
        normalPanel.add(divButton);

        // normal panel's action listener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double norFirstNum = Double.parseDouble(norInputTextField1.getText());
                double norSecNum = Double.parseDouble(norInputTextField2.getText());
                result = norFirstNum + norSecNum;
                norResultField.setText(Double.toString(result));
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double norFirstNum = Double.parseDouble(norInputTextField1.getText());
                double norSecNum = Double.parseDouble(norInputTextField2.getText());
                result = norFirstNum - norSecNum;
                norResultField.setText(Double.toString(result));
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double norFirstNum = Double.parseDouble(norInputTextField1.getText());
                double norSecNum = Double.parseDouble(norInputTextField2.getText());
                result = norFirstNum * norSecNum;
                norResultField.setText(Double.toString(result));
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double norFirstNum = Double.parseDouble(norInputTextField1.getText());
                double norSecNum = Double.parseDouble(norInputTextField2.getText());
                result = norFirstNum / norSecNum;
                norResultField.setText(Double.toString(result));
            }
        });

        // --------------------Scientific mode panel-------------------- //
        JPanel scientificPanel = new JPanel();
        scientificPanel.setLayout(new GridLayout(4, 2));

        // Label and text field for input
        JLabel sciResultLabel = new JLabel("Result:");
        sciResultLabel.setHorizontalAlignment(sciResultLabel.CENTER);
        JTextField sciResultField = new JTextField("0");
        sciResultField.setHorizontalAlignment(sciResultField.CENTER);
        sciResultField.setEditable(false);

        JLabel sciInputLabel = new JLabel("Number:");
        sciInputLabel.setHorizontalAlignment(sciInputLabel.CENTER);
        JTextField sciInputTextField = new JTextField();
        sciInputTextField.setHorizontalAlignment(sciInputTextField.CENTER);

        JButton sinButton = new JButton("sin");
        JButton cosButton = new JButton("cos");
        JButton tanButton = new JButton("tan");
        JButton logButton = new JButton("log");

        // Add component to scientific panel
        scientificPanel.add(sciResultLabel);
        scientificPanel.add(sciResultField);
        scientificPanel.add(sciInputLabel);
        scientificPanel.add(sciInputTextField);
        scientificPanel.add(sinButton);
        scientificPanel.add(cosButton);
        scientificPanel.add(tanButton);
        scientificPanel.add(logButton);

        // Scientific panel's action listener
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sciNumber = Double.parseDouble(sciInputTextField.getText());
                result = Math.sin(sciNumber);
                sciResultField.setText(Double.toString(result));
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sciNumber = Double.parseDouble(sciInputTextField.getText());
                result = Math.cos(sciNumber);
                sciResultField.setText(Double.toString(result));

            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sciNumber = Double.parseDouble(sciInputTextField.getText());
                result = Math.tan(sciNumber);
                sciResultField.setText(Double.toString(result));
            }
        });

        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sciNumber = Double.parseDouble(sciInputTextField.getText());
                result = Math.log(sciNumber);
                sciResultField.setText(Double.toString(result));
            }
        });

        // Add both panel to the cardPanel with unique identifiers
        cardPanel.add(normalPanel,"Normal");
        cardPanel.add(scientificPanel,"Scientific");

        // Add to fram
        frame.add(cardPanel);

        // Menu iteam action listener
        normalItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout c1 = (CardLayout) (cardPanel.getLayout());
                c1.show(cardPanel, "Normal");
            }
        });

        scientificItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout c1 = (CardLayout) (cardPanel.getLayout());
                c1.show(cardPanel, "Scientific");
            }
        });

        // Display
        frame.setVisible(true);
    }

}