package ArraysAndLists_04;

import java.util.Scanner;

public class CompareCharacterArraysLexicographically_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();


        boolean isEqual = true;

        for (int i = 0; i < Math.min(firstChar.length, secondChar.length); i++) {

            if (firstChar[i] < secondChar[i]) {
                System.out.println("first");
                isEqual = false;
                break;
            }
            if (secondChar[i] < firstChar[i]) {
                System.out.println("second");
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            if (firstChar.length == secondChar.length) {
                System.out.println("equal");
            } else if (firstChar.length < secondChar.length) {
                System.out.println("first");
            } else if (firstChar.length > secondChar.length) {
                System.out.println("second");
            }
        }

    }
}

