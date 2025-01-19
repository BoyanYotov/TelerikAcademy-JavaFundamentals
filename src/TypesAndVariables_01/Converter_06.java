package TypesAndVariables_01;

import java.util.Scanner;

public class Converter_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mpg = Integer.parseInt(scanner.nextLine());

        double kilometers = mpg * 1.6;
        double liters = 4.54;

        double europeanPMG = Math.floor ((4.54 / kilometers) * 100);

        System.out.printf("%.0f litres per 100 km",europeanPMG);
    }
}
