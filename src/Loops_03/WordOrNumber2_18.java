package Loops_03;

import java.util.Scanner;

public class WordOrNumber2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String chainWords = "";
        int number = 0;
        int wordnumber = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            char last = input.charAt(input.length() - 1);

            if (last >= 48 && last <= 57) {
                number = Integer.parseInt(input);
                sum += number;
            } else if ((last >= 97 && last <= 122) || (last >= 65 && last <= 90)) {
                wordnumber++;

                if (wordnumber == 1) {
                    chainWords = input;
                }
                if (wordnumber > 1) {
                    chainWords += ("-" + input);
                }
            }
        }

        if (wordnumber == 0) {
            chainWords = "no words";
        }

        System.out.printf("%s%n", chainWords);
        System.out.printf("%d", sum);
    }
}