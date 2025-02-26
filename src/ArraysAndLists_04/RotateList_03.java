package ArraysAndLists_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RotateList_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine()
                        .split(","))
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String firstDigit = numbers.get(0);
            for (int j = 0; j < numbers.size() - 1; j++) {

                numbers.set(j, numbers.get(j + 1));
            }
            numbers.set(numbers.size() - 1, firstDigit);
        }

        System.out.println(String.join(",", numbers));

    }
}
