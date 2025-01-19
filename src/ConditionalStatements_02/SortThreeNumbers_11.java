package ConditionalStatements_02;

import java.util.Scanner;

public class SortThreeNumbers_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (b > a) {
            if (a > c) {
                System.out.printf("%d %d %d", b, a, c);
            } else {
                System.out.printf("%d %d %d", b, c,a);
            }
        }

        if (c > a) {
            if (a > b) {
                System.out.printf("%d %d %d", c, a, b);
            } else {
                System.out.printf("%d %d %d", c, b, a);
            }
        }

        if (a > b) {
            if (b > c) {
                System.out.printf("%d %d %d", a, b, c);
            } else {
                System.out.printf("%d %d %d", a, c, b);
            }
        }
    }
}