package TypesAndVariables_01;

import java.util.Scanner;

public class SumDigitsV2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstDigit = number % 10;
        number /= 10;

        int secondDigit = number % 10;
        number /= 10;

        int thirdDigit = number % 10;
        number /= 10;

        int forthNumber = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit + forthNumber;

        System.out.println(sum);
    }
}


