package ArraysAndLists_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrookedDigits_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> input = new ArrayList<>(Arrays.stream(scanner.nextLine().split("")).toList());

        if (input.contains(".")) {
            input.removeAll(List.of("."));
        }
        if (input.contains("-")) {
            input.removeAll(List.of("-"));
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= input.size() - 1; i++) {
            String item = input.get(i);
            numbers.add(i, Integer.parseInt(item));
        }

        int sum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int item = numbers.get(i);
            sum += item;
        }

        int newSum = 0;
        while (sum > 0) {
            int lastDigit = sum % 10;
            newSum += lastDigit;
            sum /= 10;
        }

        System.out.println(newSum);
    }
}

