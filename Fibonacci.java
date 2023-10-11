package lab7;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0, second = 1, next;

        System.out.println("Enter the ");
        int n = sc.nextInt();

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}
