package Loops_03;

import java.util.Scanner;

public class PrimeFactors_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n != 1){
            for (int i = 2; i <= n ; i++) {
                if (n % i == 0){
                    n /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
