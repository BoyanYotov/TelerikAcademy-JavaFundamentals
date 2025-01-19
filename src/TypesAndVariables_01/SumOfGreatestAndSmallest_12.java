package TypesAndVariables_01;

import java.util.Scanner;

public class SumOfGreatestAndSmallest_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double bigger = Math.max(a,b);
        double biggest = Math.max(bigger,c);

        double smaller = Math.min(a,b);
        double smallest = Math.min(smaller,c);

        double sum = biggest + smallest;

        System.out.printf("%.0f",sum);

    }
}
