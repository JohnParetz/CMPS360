package Assignment1;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        // Basic student information
        String name = "John";
        String major = "Applied Computer Science";
        String course = "Java Programming";

        // Grades from three assignments
        double assignment1 = 95;
        double assignment2 = 82;
        double assignment3 = 90;

        // Calculate the final average
        double average = (assignment1 + assignment2 + assignment3) / 3;

        // Display student report
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Course: " + course);

        System.out.println("\nGrade Summary");
        System.out.println("Assignment 1: " + assignment1);
        System.out.println("Assignment 2: " + assignment2);
        System.out.println("Assignment 3: " + assignment3);
        System.out.printf("Final Average: %.2f%%\n", average);

        // Determine the letter grade
        if (average >= 90) {
            System.out.println("Letter Grade: A");
        } else if (average >= 80) {
            System.out.println("Letter Grade: B");
        } else if (average >= 70) {
            System.out.println("Letter Grade: C");
        } else if (average >= 60) {
            System.out.println("Letter Grade: D");
        } else {
            System.out.println("Letter Grade: F");
        }

        // Check whether the student passed
        if (average >= 70) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
    }
}