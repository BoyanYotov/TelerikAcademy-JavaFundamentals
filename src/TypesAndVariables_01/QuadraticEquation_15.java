package TypesAndVariables_01;

import java.util.Scanner;

public class QuadraticEquation_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double d = (b * b) - (4 * a * c);

        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);

        System.out.printf("x1=%.1f%n",x1 + 0.0);
        System.out.printf("x2=%.1f",x2 + 0.0);
    }
}
