
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // Path 1: Student greeting
    @GetMapping("/api/hello")
    public String hello(@RequestParam(defaultValue = "") String name) {

        if (name.isBlank()) {
            return "Hello! Please enter your name.";
        } else {
            return "Hey " + name + "! Welcome to the Student Portal.";
        }
    }

    // Path 2: Exam results
    @GetMapping("/api/exam")
    public String exam(@RequestParam(defaultValue = "0") int score) {

        if (score < 0 || score > 100) {
            return "Invalid score. Enter a number between 0 and 100.";
        } else if (score >= 90) {
            return "Excellent work! You earned an A.";
        } else if (score >= 80) {
            return "Great job! You earned a B.";
        } else if (score >= 70) {
            return "You passed with a C.";
        } else if (score >= 60) {
            return "You earned a D. Keep practicing!";
        } else {
            return "You earned an F. More studying is needed.";
        }
    }

    // Path 3: Study hours
    @GetMapping("/api/study")
    public String study(@RequestParam(defaultValue = "0") int hours) {

        if (hours < 0) {
            return "Study hours cannot be negative.";
        } else if (hours >= 10) {
            return "Excellent! You spent a lot of time studying.";
        } else if (hours >= 5) {
            return "Good progress! Keep up your study routine.";
        } else {
            return "Try setting aside more time to study.";
        }
    }

    // Path 4: Course recommendation
    @GetMapping("/api/recommend")
    public String recommend(@RequestParam(defaultValue = "") String interest) {

        if (interest.equalsIgnoreCase("programming")) {
            return "Recommended course: Java Programming.";
        } else if (interest.equalsIgnoreCase("web")) {
            return "Recommended course: Web Development.";
        } else if (interest.equalsIgnoreCase("database")) {
            return "Recommended course: Database Management.";
        } else {
            return "Try programming, web, or database.";
        }
    }
}
