package Loops_03;

import java.util.Scanner;

public class MinMaxSumAverage_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum =0;
        double maxValue = Integer.MIN_VALUE;
        double minValue = Integer.MAX_VALUE;

        for (int i = 1; i <=n ; i++) {
            double input = Double.parseDouble(scanner.nextLine());

            if (input > maxValue){
                maxValue = input;
            }
            if (input < minValue){
                minValue = input;
            }
            sum += input;
        }

        double avg = sum / n;

        System.out.printf("min=%.2f%n",minValue);
        System.out.printf("max=%.2f%n",maxValue);
        System.out.printf("sum=%.2f%n",sum);
        System.out.printf("avg=%.2f",avg);

    }
}
