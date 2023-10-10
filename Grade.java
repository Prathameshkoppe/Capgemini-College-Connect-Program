package lab6;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter your Grade:");
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);

        if (X == 'A' || X == 'B' || X == 'C' || X == 'F') {
            if (X == 'A') {
                System.out.println("Your marks in range 80-100");
            } else if (X == 'B') {
                System.out.println("Your marks in range 60-79");
            } else if (X == 'C') {
                System.out.println("Your marks in range 40-59");
            } else {
                System.out.println("Your marks in range 00-39");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
