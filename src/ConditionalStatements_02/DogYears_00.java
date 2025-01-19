package ConditionalStatements_02;

import java.util.Scanner;

public class DogYears_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int humanYears = Integer.parseInt(scanner.nextLine());
        int dogYears = 0;

        if (humanYears == 1){
            dogYears = 10;
        } else if (humanYears == 2){
            dogYears = 20;
        } else if (humanYears > 2){
            dogYears = 20 + (humanYears - 2) * 4;
        }

        System.out.println(dogYears);
    }
}
