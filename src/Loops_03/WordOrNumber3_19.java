package Loops_03;

import java.util.Scanner;

public class WordOrNumber3_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();

        boolean previousIsDigit = false;
        boolean previousIsWord = false;
        boolean currentIsDigit = false;
        boolean currentIsWord = false;

        StringBuilder result = new StringBuilder();

        int sum = Integer.MIN_VALUE;


        for (int i = 0; i < lines; i++) {
            String input = scanner.next();

            if (Character.isDigit(input.charAt(input.length() - 1))) {
                if (previousIsDigit) {
                    sum += Integer.parseInt(input);
                } else {
                    sum = Integer.parseInt(input);
                }
                currentIsDigit = true;

            } else {
                if (previousIsWord) {
                    result.append("-").append(input);
                } else {
                    result.append(input);
                }
                currentIsWord = true;
            }

            if (!previousIsDigit && !previousIsWord) {
                previousIsDigit = currentIsDigit;
                previousIsWord = currentIsWord;

                currentIsDigit = false;
                currentIsWord = false;
                      continue;
            }


            if (previousIsDigit && currentIsWord) {
                System.out.println(sum);
                sum = Integer.MIN_VALUE;
            }

            if (previousIsWord && currentIsDigit) {
                System.out.println(result);
                result = new StringBuilder();
            }


            previousIsDigit = currentIsDigit;
            previousIsWord = currentIsWord;

            currentIsDigit = false;
            currentIsWord = false;
        }

        if (!result.toString().isEmpty()) {
            System.out.println(result);
        }

        if (sum != Integer.MIN_VALUE) {
            System.out.println(sum);
        }
    }
}