package Loops_03;

import java.util.Scanner;

public class NumberWave_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        for (int j = n; j > 1; j--) {
            System.out.print(j - 1 + " ");
        }
    }
}



