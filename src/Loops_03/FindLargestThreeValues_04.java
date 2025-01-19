package Loops_03;

import java.util.Scanner;

public class FindLargestThreeValues_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int largest = Math.max(Math.max(firstNumber,secondNumber), thirdNumber);
        int smallest = Math.min(Math.min(firstNumber,secondNumber), thirdNumber);
        int middle = firstNumber + secondNumber + thirdNumber - largest - smallest;

        for (int i = 4; i <= lines; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > largest){
                smallest = middle;
                middle = largest;
                largest = currentNumber;
                continue;
            }
            if (currentNumber > middle){
                smallest = middle;
                middle = currentNumber;
                continue;
            }
            if (currentNumber > smallest){
                smallest = currentNumber;
            }
        }

        System.out.printf("%d, %d and %d",largest,middle,smallest);
    }
}
