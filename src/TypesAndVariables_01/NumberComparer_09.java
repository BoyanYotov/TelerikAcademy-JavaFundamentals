package TypesAndVariables_01;

import java.util.Scanner;

public class NumberComparer_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int result = Math.max(a, b);

        System.out.println(result);
    }
}
