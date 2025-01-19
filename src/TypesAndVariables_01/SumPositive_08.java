package TypesAndVariables_01;

import java.util.Scanner;

public class SumPositive_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = n * (n + 1) / 2;

        System.out.println(sum);

        }
    }

