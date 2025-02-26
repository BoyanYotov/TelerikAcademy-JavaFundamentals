package ArraysAndLists_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySearch_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= numbers.size(); i++) {
            if (!numbers.contains(i)) {
                missing.add(i);
            }
        }

        for (int i = 0; i <= missing.size() - 1; i++) {
            int item = missing.get(i);
            if (i == missing.size() - 1) {
                System.out.print(item);
            } else {
                System.out.print(item + ",");
            }
        }
    }
}
