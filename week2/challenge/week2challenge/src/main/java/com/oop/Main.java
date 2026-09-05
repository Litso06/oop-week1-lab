package com.oop;

public class Main {
    public static void main(String[] args) {
        Student mikesGrade = new Student();

        mikesGrade.name = "Mike";
        mikesGrade.updateGrade(30);

        System.out.println("Before Grade Add: " + mikesGrade.grade);
        mikesGrade.updateGrade(47);
        System.out.println("After Grade Add: " + mikesGrade.grade);
    }
}