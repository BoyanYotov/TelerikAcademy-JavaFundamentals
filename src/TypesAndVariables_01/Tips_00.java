package TypesAndVariables_01;

import java.util.Scanner;

public class Tips_00 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mealPrice = Double.parseDouble(scanner.nextLine());
        double finalPrice = mealPrice * 1.1;

        System.out.printf("%.0f", finalPrice);

    }
}
