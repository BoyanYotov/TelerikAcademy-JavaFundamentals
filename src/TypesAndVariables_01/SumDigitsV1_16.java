package TypesAndVariables_01;

import java.util.Scanner;

public class SumDigitsV1_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        String firstDigit = number.substring(0,1);
        String secondDigit = number.substring(1,2);
        String thirdDigit = number.substring(2,3);
        String fourthDigit = number.substring(3,4);

        int a = Integer.parseInt(firstDigit);
        int b = Integer.parseInt(secondDigit);
        int c = Integer.parseInt(thirdDigit);
        int d = Integer.parseInt(fourthDigit);

        int sum = a + b + c + d;

        System.out.println(sum);
    }
}
