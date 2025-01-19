package TypesAndVariables_01;

import java.util.Scanner;

public class Interest_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        double interest1 = sum + (sum * 0.05);
        double interest2 = interest1 * (1 + 0.05);
        double interest3 = interest2 * (1 + 0.05);

        System.out.printf("%.2f%n",interest1);
        System.out.printf("%.2f%n",interest2);
        System.out.printf("%.2f%n",interest3);
    }
}
