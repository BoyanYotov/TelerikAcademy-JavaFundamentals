package Loops_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WordOrNumber_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String newInput = "";
        char letter;
        char last = input.charAt(input.length() - 1);

        if ((last >= 97 && last <= 122) || (last >= 65 && last <= 95)) {
            for (int i = input.length() - 1; i >= 0; i--) {
                letter = input.charAt(i);
                System.out.printf("%c", letter);
            }
        } else if ((last >= 48 && last <= 57)) {
            double number = Double.parseDouble(input) + 1;
            DecimalFormat df1 = new DecimalFormat("###.###");
            System.out.println(df1.format(number));
        }
    }
}
