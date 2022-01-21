package test;

import java.util.Scanner;

/*5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

public class Multiplier {

  /*public int digitMultiplier(int a, int b ){
        return a*b;

    }*/

    public static void main(String[] args) {

        /* Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.digitMultiplier(25,5));*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in two digit.");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + "+" + b + "=" + a * b);
    }

}
