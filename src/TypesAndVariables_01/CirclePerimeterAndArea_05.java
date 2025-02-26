package TypesAndVariables_01;

import java.util.Scanner;

public class CirclePerimeterAndArea_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;

        System.out.printf("%.2f%n", perimeter);
        System.out.printf("%.2f", area);

    }
}
