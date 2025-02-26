package ConditionalStatements_02;

import java.util.Scanner;

public class IntDoubleString_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        if (input1.equals("integer")) {
            int numberInt = Integer.parseInt(input2);
            System.out.print(numberInt + 1);

        } else if (input1.equals("real")) {
            double numberDouble = Double.parseDouble(input2);
            System.out.printf("%.2f", numberDouble + 1);

        } else if (input1.equals("text")) {
            System.out.print(input2 + "*");
        }
    }
}
