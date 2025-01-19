package TypesAndVariables_01;

import java.util.Scanner;

public class SumOfFiveNumbers_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());

        int sum = a + b + c + d + e;

        System.out.println(sum);
    }
}
