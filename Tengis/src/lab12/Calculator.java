package lab12;

import javax.swing.*;
import java.awt.event.*;

public class Calculator {

    private double number1;
    private double number2;

    JFrame f;

    
    Calculator() {

        f = new JFrame("Toonii mashin");

        

        JTextField t1 = new JTextField();
        t1.setBounds(20, 25, 130, 30);
        f.add(t1);

        JLabel l2 = new JLabel("2r operand");
        l2.setBounds(180, 5, 100, 20);
        f.add(l2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(180, 25, 130, 30);
        f.add(t2);

        JTextField t3 = new JTextField();
        t3.setBounds(20, 105, 290, 30);
        t3.setEditable(false);
        f.add(t3);

        
        JButton b1 = new JButton("+");
        b1.setBounds(20, 65, 50, 30);

        JButton b2 = new JButton("-");
        b2.setBounds(100, 65, 50, 30);

        JButton b3 = new JButton("*");
        b3.setBounds(180, 65, 50, 30);

        JButton b4 = new JButton("/");
        b4.setBounds(260, 65, 50, 30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(t1.getText());
                number2 = Double.parseDouble(t2.getText());

                double result = add(number1, number2);
                t3.setText(String.valueOf(result));
            }
        });

       
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(t1.getText());
                number2 = Double.parseDouble(t2.getText());

                double result = subtract(number1, number2);
                t3.setText(String.valueOf(result));
            }
        });

       
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(t1.getText());
                number2 = Double.parseDouble(t2.getText());

                double result = multiply(number1, number2);
                t3.setText(String.valueOf(result));
            }
        });

        
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(t1.getText());
                number2 = Double.parseDouble(t2.getText());

                double result = divide(number1, number2);
                t3.setText(String.valueOf(result));
            }
        });

       
        f.setSize(350, 180);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    
    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(f, "0-t huvaaj bolohgui!");
            return 0;
        }
        return a / b;
    }
}