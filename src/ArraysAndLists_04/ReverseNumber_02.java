package ArraysAndLists_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Character> listOfNumber = new ArrayList<>();

        for (int i = 0; i <= input.length()-1 ; i++) {
            char digit = input.charAt(i);
            listOfNumber.add(digit);
        }

        Collections.reverse(listOfNumber);
        for (Character c : listOfNumber) {
            System.out.print(c);
        }
    }
}
