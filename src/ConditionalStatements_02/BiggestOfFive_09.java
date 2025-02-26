package ConditionalStatements_02;

import java.util.Scanner;

public class BiggestOfFive_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());

        int biggest = a;

        if (b > a) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }
        if (d > biggest) {
            biggest = d;
        }
        if (e > biggest) {
            biggest = e;
        }

        System.out.print(biggest);
    }
}
