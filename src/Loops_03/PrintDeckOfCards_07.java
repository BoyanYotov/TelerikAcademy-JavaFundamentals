package Loops_03;

import java.util.Scanner;

public class PrintDeckOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = 0;

        if (Character.isDigit(input.charAt(input.length() - 1))) {
            number = Integer.parseInt(input);
            if (number <= 10) {
                for (int i = 2; i <= number; i++) {
                    System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
                }
            }
        } else {
            if (input.equals("J")) {
                for (int i = 2; i <= 10; i++) {
                    System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
                }
                System.out.println("J of spades, J of clubs,J of hearts, J of diamonds");
            } else if (input.equals("Q")) {
                for (int i = 2; i <= 10; i++) {
                    System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
                }
                System.out.println("J of spades, J of clubs,J of hearts, J of diamonds");
                System.out.println("Q of spades, Q of clubs,Q of hearts, Q of diamonds");
            } else if (input.equals("K")) {
                for (int i = 2; i <= 10; i++) {
                    System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
                }
                System.out.println("J of spades, J of clubs,J of hearts, J of diamonds");
                System.out.println("Q of spades, Q of clubs,Q of hearts, Q of diamonds");
                System.out.println("K of spades, K of clubs,K of hearts, K of diamonds");
            } else if (input.equals("A")){
                for (int i = 2; i <= 10; i++) {
                    System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
                }
                System.out.println("J of spades, J of clubs,J of hearts, J of diamonds");
                System.out.println("Q of spades, Q of clubs,Q of hearts, Q of diamonds");
                System.out.println("K of spades, K of clubs,K of hearts, K of diamonds");
                System.out.println("A of spades, A of clubs,A of hearts, A of diamonds");
            }
        }
    }
}