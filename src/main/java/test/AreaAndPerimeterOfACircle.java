package test;

/*11. Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

import java.util.Scanner;

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the Radius in cm");
        double rad = scanner.nextDouble();
        System.out.println("Perimeter is " + (2 * rad * Math.PI));
        System.out.println("Area is " + (rad * rad) * Math.PI);

    }
}

