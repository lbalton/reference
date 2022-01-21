package test;
/*
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/


import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in three number");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a+b+c)/3);

    }

}
