package Loops_03;

import java.util.Scanner;

public class CalculateDiscount_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            double price = scanner.nextDouble();
            double discounted = price * 0.35;
            System.out.printf("%.2f%n", discounted);
            scanner.nextLine();
        }
    }
}
