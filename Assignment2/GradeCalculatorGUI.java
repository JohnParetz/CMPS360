
package Assignment2;

import javax.swing.*;
import java.awt.*;

public class GradeCalculatorGUI {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quiz Grade Checker");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // Quiz input fields
            JTextField quiz1 = new JTextField();
            JTextField quiz2 = new JTextField();
            JTextField quiz3 = new JTextField();

            JLabel result = new JLabel("Enter your quiz scores.");
            JButton calculate = new JButton("Check Grades");

            panel.add(new JLabel("Quiz 1:"));
            panel.add(quiz1);

            panel.add(new JLabel("Quiz 2:"));
            panel.add(quiz2);

            panel.add(new JLabel("Quiz 3:"));
            panel.add(quiz3);

            panel.add(calculate);
            panel.add(new JLabel(""));

            panel.add(new JLabel("Result:"));
            panel.add(result);

            // Run when the button is clicked
            calculate.addActionListener(event -> {
                try {
                    double score1 = Double.parseDouble(quiz1.getText());
                    double score2 = Double.parseDouble(quiz2.getText());
                    double score3 = Double.parseDouble(quiz3.getText());

                    // Check for scores outside the valid range
                    if (score1 < 0 || score1 > 100 ||
                        score2 < 0 || score2 > 100 ||
                        score3 < 0 || score3 > 100) {
                        result.setText("Enter scores from 0 to 100.");
                        return;
                    }

                    double average = (score1 + score2 + score3) / 3;
                    String letterGrade;

                    if (average >= 90) {
                        letterGrade = "A";
                    } else if (average >= 80) {
                        letterGrade = "B";
                    } else if (average >= 70) {
                        letterGrade = "C";
                    } else if (average >= 60) {
                        letterGrade = "D";
                    } else {
                        letterGrade = "F";
                    }

                    String status = average >= 70 ? "Passed" : "Failed";

                    result.setText(String.format(
                        "%.1f%% - %s - %s",
                        average, letterGrade, status));

                } catch (NumberFormatException e) {
                    result.setText("Please enter valid numbers.");
                }
            });

            frame.add(panel);
            frame.setSize(480, 280);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
