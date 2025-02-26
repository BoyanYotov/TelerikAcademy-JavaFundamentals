package TypesAndVariables_01;

import java.util.Scanner;

public class Arithmetics_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int rem = a % b;
        int pow = (int) Math.pow(a, b);

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(rem);
        System.out.println(pow);

    }
}
