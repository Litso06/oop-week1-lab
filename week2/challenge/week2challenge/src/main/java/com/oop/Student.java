package com.oop;

public class Student {
    // Attributes
    String name;
    public int grade;

    // State or Behaviour
    public void updateGrade(int newGrade) {
        if (newGrade < 0 || newGrade >100) {
        System.out.println("Invalid Grade. Must be between 0 and 1");
        return;
        }
        this.grade = newGrade;
    }
}
