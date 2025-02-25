package Loops_03;

import java.util.Scanner;

public class FindAverage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double newNumber = Double.parseDouble(scanner.nextLine());
            sum += newNumber;
        }

        double avg = sum / n;
        System.out.printf("%.2f", avg);
    }
}
