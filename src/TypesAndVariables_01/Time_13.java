package TypesAndVariables_01;

import java.util.Scanner;

public class Time_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double minutes = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double result = seconds + (minutes * 60) + (hours * 60 * 60) + (days * 60 * 60 * 24);

        System.out.printf("%.0f", result);

    }
}
