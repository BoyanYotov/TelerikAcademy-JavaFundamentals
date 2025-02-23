package Loops_03;

import java.util.Scanner;

public class VowelToLengthRatio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int vowels = 0;
        double ratio = 0;
        double bestRatio = 1;
        String food = "";
        String bestFood = "";
        int letters = 0;
        int bestVowels = 0;
        int bestLetters = 0;

        for (int i = 1; i <= n; i++) {
            letters = 0;
            vowels = 0;
            food = scanner.nextLine();
            int length = food.length();

            for (int j = 0; j < length; j++) {
                char letter = food.charAt(j);
                letters++;
                switch (letter) {
                    case 'a':
                    case 'o':
                    case 'u':
                    case 'e':
                    case 'i':
                        vowels++;
                        break;
                }
            }

            ratio = vowels * 1.0 / length;

            if ((ratio < bestRatio)){
                bestRatio = ratio;
                bestVowels = vowels;
                bestFood = food;
                bestLetters = letters;
            } else if ((ratio == bestRatio) && (vowels > bestVowels)){
                bestFood = food;
                bestVowels = vowels;
                bestLetters = letters;
            } else if ((ratio == bestRatio) && (vowels == bestVowels) && (letters > bestLetters)){
                bestFood = food;
                bestVowels = vowels;
                bestLetters = letters;
            }
        }
        System.out.printf("%s %d/%d", bestFood, bestVowels, bestLetters);
    }
}
