package Loops_03;

import java.util.Scanner;

public class LongestString_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = 0;
        String bestfood = "";

        while (true) {
            String food = scanner.next();
            if (food.equals("END")) {
                break;
            }

            int length = food.length();

            if (length > longest) {
                longest = length;
                bestfood = food;
            } else if (length == longest){
                bestfood = food;
            }
        }

        System.out.printf("%s", bestfood);
    }
}
