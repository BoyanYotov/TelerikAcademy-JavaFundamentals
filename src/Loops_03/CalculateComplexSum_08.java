package Loops_03;

import java.util.Scanner;

public class CalculateComplexSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double half = 0;
        double S = 0;
        int factorial = 1;

        for (int i = 1; i <= n ; i++) {
            factorial *= i;
            half = factorial / Math.pow(x,(i));
            S += half;
        }
        System.out.printf("%.5f", S + 1);
    }
}
