package lab6;
import java.util.Scanner;

public class Calculater {

    public void calculation(int X, double A, double B) {
        switch (X) {
            case 1:
                System.out.println("Addition is= " + (A + B));
                break;
            case 2:
                System.out.println("Subtraction=" + (A - B));
                break;
            case 3:
                System.out.println("Multiplication is=" + (A * B));
                break;
            case 4:
                if (B != 0) {
                    System.out.println("Division is=" + (A / B));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Operation");
        System.out.println("1:Addition");
        System.out.println("2:Subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");

        int X = sc.nextInt();
        System.out.println("Enter Your Two numbers");
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        Calculater calculater = new Calculater();
        calculater.calculation(X, A, B);
        sc.close();
    }
}
