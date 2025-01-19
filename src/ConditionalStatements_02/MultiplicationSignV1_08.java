package ConditionalStatements_02;

import java.util.Scanner;

public class MultiplicationSignV1_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        if ((a * b * c) > 0){
            System.out.print("+");
        } else if ((a * b * c) == 0){
            System.out.print("0");
        } else {
            System.out.print("-");
        }
    }
}
