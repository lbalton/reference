package test;

/*2. Write a Java program to print the sum of two numbers. Go to the editor
        Test Data:
        74 + 36
        Expected Output :
        110*/

public class SumMethod {


    public int SumDigit(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        SumMethod sumMethod = new SumMethod();
        System.out.println(sumMethod.SumDigit(10, 30));

    }
}
