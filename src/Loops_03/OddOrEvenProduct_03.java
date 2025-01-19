package Loops_03;

import java.util.Scanner;

public class OddOrEvenProduct_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int lines = Integer.parseInt(scanner.nextLine());
            long productOddLines = 1;
            long productEvenLines = 1;

         for (int i = 1; i <= lines; i++) {
            int number = scanner.nextInt();
            if (i % 2 != 0) {
                productOddLines *= number;
            } else {
                productEvenLines *= number;
            }
        }

        if (productOddLines == productEvenLines) {
            System.out.printf("yes %d%n", productOddLines);
        } else {
            System.out.printf("no %d %d%n", productOddLines, productEvenLines);
        }
    }
}