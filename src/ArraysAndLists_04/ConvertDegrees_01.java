package ArraysAndLists_04;

import java.util.Scanner;

public class ConvertDegrees_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i <= input.length - 1 ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        double[] farenheit = new double[numbers.length];
        for (int i = 0; i <= numbers.length-1 ; i++) {
            double converted = numbers[i] * 1.8 + 32;
            farenheit[i] = converted;
        }
        for (double number : farenheit) {
            System.out.printf("%.0f%n",number);
        }
    }
}
