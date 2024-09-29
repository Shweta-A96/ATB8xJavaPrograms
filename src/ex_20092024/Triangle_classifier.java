package ex_20092024;

import java.util.Scanner;

public class Triangle_classifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

        int side1 = 30;
        int side2 = 30;
        int side3 = 30;

        if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("triangle is equilateral when all sides are equal");
        } else if (side1 == side2 && side2 != side3 && side3 != side1) {
            System.out.println("triangle is isosceles when exactly two sides are equal");
        } else if (side1 != side2 && side2 != side3 && side3 != side1) {
            System.out.println("triangle is scalene when no sides are equal");
        }
    }
}




