package lab8;


import java.util.Scanner;

public class PrimeNoPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int count = 0; // Reset count for each number i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i); 
            }
        }
    }
}
