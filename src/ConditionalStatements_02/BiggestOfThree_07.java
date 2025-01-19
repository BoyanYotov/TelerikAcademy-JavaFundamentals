package ConditionalStatements_02;

import java.util.Scanner;

public class BiggestOfThree_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int biggestNumber = number1;

        if (number2 > number1){
            biggestNumber = number2;
        }

        if (number3 >= biggestNumber){
            biggestNumber=number3;
        }

        System.out.print(biggestNumber);
    }

}
