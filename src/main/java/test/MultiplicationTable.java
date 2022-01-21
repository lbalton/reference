package test;

/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class MultiplicationTable {

    public void multiplication(int a) {

        for (int x = 1; x <= 10; x++) {
            System.out.println(a + " x " + x + " = " + (a * x));
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = scanner.nextInt();

        multiplicationTable.multiplication(num);

    }
}
