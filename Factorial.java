package lab7;

import java.util.Scanner;

public class Factorial {

	public static int calculateFact(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result = result *i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();

        int factorial = calculateFact(n);
        System.out.println("Factorial of " + n + " is: " + factorial);

}
}
