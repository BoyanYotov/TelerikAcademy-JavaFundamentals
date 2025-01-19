package Loops_03;

import java.util.Scanner;

public class SmallerGreaterOrEqual_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int previousNumber = 0;
        char sign = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i == 1){
                System.out.print(currentNumber);
                previousNumber = currentNumber;
            } else {
                if (currentNumber < previousNumber){
                    sign = '>';
                } else if (currentNumber > previousNumber){
                    sign = '<';
                } else {
                    sign = '=';
                }

                System.out.printf("%c%d",sign,currentNumber);
                previousNumber = currentNumber;

            }
        }
    }
}
