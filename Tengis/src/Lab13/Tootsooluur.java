package Lab13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tootsooluur extends JFrame {

    JTextField massField;
    JTextField volumeField;
    JComboBox<String> massUnitBox;
    JComboBox<String> volumeUnitBox;
    JComboBox<String> densityUnitBox;
    JLabel answerLabel;
    JButton calculateButton;
    JButton clearButton;

    public Tootsooluur() {

        setTitle("Tootsooluur");
        setSize(750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(15, 15));
        mainPanel.setBackground(new Color(230, 235, 245));

        JLabel title = new JLabel("Тооцоолуур");
        title.setFont(new Font("Arial", Font.BOLD, 34));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        JLabel formula = new JLabel("ρ = m / V");
        formula.setFont(new Font("Serif", Font.BOLD, 42));
        JPanel formulaPanel = new JPanel();
        formulaPanel.setBackground(new Color(230, 235, 245));
        formulaPanel.add(formula);

        JPanel inputPanel = new JPanel(new GridLayout(3, 3, 15, 15));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        inputPanel.setBackground(new Color(230, 235, 245));
        JLabel densityLabel = new JLabel("Нягт:");
        densityLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel massLabel = new JLabel("Масс:");
        massLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        JLabel volumeLabel = new JLabel("Эзлэхүүн:");
        volumeLabel.setFont(new Font("Arial", Font.PLAIN, 24));

        
        JTextField densityField = new JTextField();
        
        densityField.setEditable(false);
        densityField.setFont(new Font("Arial", Font.PLAIN, 22));

        massField = new JTextField();
        massField.setFont(new Font("Arial", Font.PLAIN, 22));

        volumeField = new JTextField();
        volumeField.setFont(new Font("Arial", Font.PLAIN, 22));

       
        String[] densityUnits = {"г/см³", "кг/м³"};
        densityUnitBox = new JComboBox<>(densityUnits);
        densityUnitBox.setFont(new Font("Arial", Font.PLAIN, 20));

        String[] massUnits = {"г", "кг"};
        massUnitBox = new JComboBox<>(massUnits);
        massUnitBox.setFont(new Font("Arial", Font.PLAIN, 20));

        String[] volumeUnits = {"см³", "м³"};
        volumeUnitBox = new JComboBox<>(volumeUnits);
        volumeUnitBox.setFont(new Font("Arial", Font.PLAIN, 20));

        
        inputPanel.add(densityLabel);
        inputPanel.add(densityField);
        inputPanel.add(densityUnitBox);

        inputPanel.add(massLabel);
        inputPanel.add(massField);
        inputPanel.add(massUnitBox);

        inputPanel.add(volumeLabel);
        inputPanel.add(volumeField);
        inputPanel.add(volumeUnitBox);

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(230, 235, 245));

        calculateButton = new JButton("Тооцоолох");
        calculateButton.setFont(new Font("Arial", Font.BOLD, 22));

        clearButton = new JButton("Арилгах");
        clearButton.setFont(new Font("Arial", Font.BOLD, 22));

        buttonPanel.add(clearButton);
        buttonPanel.add(Box.createHorizontalStrut(60));
        buttonPanel.add(calculateButton);

       
        JPanel answerPanel = new JPanel(new BorderLayout());
        answerPanel.setBorder(BorderFactory.createTitledBorder("Хариу:"));
        answerPanel.setBackground(new Color(230, 235, 245));

        answerLabel = new JLabel(" ");
        answerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        answerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        answerPanel.add(answerLabel, BorderLayout.CENTER);

        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(230, 235, 245));

        centerPanel.add(formulaPanel);
        centerPanel.add(inputPanel);
        centerPanel.add(buttonPanel);
        centerPanel.add(answerPanel);

       
        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        add(mainPanel);

        
        calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    double mass = Double.parseDouble(massField.getText());
                    double volume = Double.parseDouble(volumeField.getText());

                    if (mass <= 0 || volume <= 0) {

                        JOptionPane.showMessageDialog(null, "Mass bolon volume 0-ees ih baih yostoi huuyy", "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    if (massUnitBox.getSelectedItem().equals("кг")) {
                        mass = mass * 1000;
                    }

                    if (volumeUnitBox.getSelectedItem().equals("м³")) {
                        volume = volume * 1000000;
                    }

                    double density = mass / volume;
                    String resultUnit = densityUnitBox.getSelectedItem().toString();

                    if (resultUnit.equals("кг/м³")) {
                        density = density * 1000;
                    }

                    densityField.setText(String.format("%.4f", density));

                    answerLabel.setText("Нягт = " + String.format("%.4f", density) + " " + resultUnit);
                }

                catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null,"Too oruulaach", "Number Error", JOptionPane.ERROR_MESSAGE);
                }
                catch (ArithmeticException ex) {

                    JOptionPane.showMessageDialog(null,"0-d huvaadaggui ym", "Math Error",JOptionPane.ERROR_MESSAGE);
                }
                catch (Exception ex) {

                    JOptionPane.showMessageDialog(null,"Aldaaaaaaaa", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                massField.setText("");
                volumeField.setText("");
                densityField.setText("");
                answerLabel.setText(" ");
            }
        });
        setVisible(true);
    }

}