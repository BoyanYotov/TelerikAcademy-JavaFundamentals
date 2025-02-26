package TypesAndVariables_01;

import java.util.Scanner;

public class BottleDeposit_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles05L = Integer.parseInt(scanner.nextLine());
        int bottles1L = Integer.parseInt(scanner.nextLine());

        double deposit = (bottles05L * 0.1) + (bottles1L * 0.25);

        System.out.printf("%.2f", deposit);

    }
}
