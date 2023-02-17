import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame {
    private JLabel label = new JLabel("Temperature Converter");
    private JButton cToFButton = new JButton("Celsius to Fahrenheit");
    private JButton fToCButton = new JButton("Fahrenheit to Celsius");

    public TemperatureConverter() {
        // Set up the frame
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(3, 1));
        setLocationRelativeTo(null);

        // Add components to the frame
        add(label);
        add(cToFButton);
        add(fToCButton);

        // Add event listeners to the buttons
        cToFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Enter temperature in Celsius:");
                if (input == null) {
                    return; // User clicked Cancel
                }

                try {
                    double celsius = Double.parseDouble(input);
                    double fahrenheit = celsius * 1.8 + 32;
                    JOptionPane.showMessageDialog(null, celsius + " Celsius = " + fahrenheit + " Fahrenheit");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input: " + input);
                }
            }
        });

        fToCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Enter temperature in Fahrenheit:");
                if (input == null) {
                    return; // User clicked Cancel
                }

                try {
                    double fahrenheit = Double.parseDouble(input);
                    double celsius = (fahrenheit - 32) / 1.8;
                    JOptionPane.showMessageDialog(null, fahrenheit + " Fahrenheit = " + celsius + " Celsius");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input: " + input);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }
}
