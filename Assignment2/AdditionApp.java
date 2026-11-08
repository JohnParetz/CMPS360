package Assignment2;

import javax.swing.*;
import java.awt.*;

public class AdditionApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("This is an Addition Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel(new GridLayout(4, 1, 8, 8));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

            JTextField first = new JTextField();
            JTextField second = new JTextField();
            JButton add = new JButton("Sum of Numbers");
            JLabel result = new JLabel("Here will be the Result");

            add.addActionListener(event -> {
                try {
                    double a = Double.parseDouble(first.getText().trim());
                    double b = Double.parseDouble(second.getText().trim());
                    result.setText("Total: " + (a + b));
                } catch (NumberFormatException ex) {
                    result.setText("Enter two valid numbers.");
                }
            });

            panel.add(first);
            panel.add(second);
            panel.add(add);
            panel.add(result);
            frame.add(panel);
            frame.setSize(360, 260);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
