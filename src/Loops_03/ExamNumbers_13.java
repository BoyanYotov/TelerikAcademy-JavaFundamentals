package Loops_03;

import java.util.Scanner;

public class ExamNumbers_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int sum = Integer.parseInt(scanner.nextLine());

        int begin = Integer.parseInt(a);
        int end = Integer.parseInt(b);

        for (int i = begin; i <= end; i++) {
            int j = i;
            int first = j % 10;
            j /= 10;
            int second = j % 10;
            j /= 10;
            int third = j % 10;

            if ((first + second + third) == sum) {
                System.out.printf("%d%d%d%n", third, second, first);
            }
        }
    }
}
