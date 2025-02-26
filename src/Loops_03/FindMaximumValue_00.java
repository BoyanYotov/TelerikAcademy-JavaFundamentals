package Loops_03;

import java.util.Scanner;

public class FindMaximumValue_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int biggest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int input = scanner.nextInt();

            if (input > biggest) {
                biggest = input;
            }
        }

        System.out.print(biggest);
    }
}
