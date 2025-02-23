package ConditionalStatements_02;

import java.util.Scanner;

public class MultiplicationSignV2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        if (a == 0 || b == 0 || c == 0) {
            System.out.print("0");
        }

        if (a < 0 && b < 0 && c < 0) {
            System.out.print("-");
        }

        if (a > 0 && b > 0 && c > 0) {
            System.out.print("-");
        }

        if ((a > 0 || b > 0 || c > 0) && (a < 0 || b < 0 || c < 0)) {
            System.out.print("-");
        }else {
            System.out.print("+");
        }
    }
}
