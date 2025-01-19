package Loops_03;

import java.util.Scanner;

public class MatrixNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int jump = 0;

        for (int i = 1; i <= n ; i++) {

            if (i > 1) {
                jump++;
                for (int j = i; j <= (n + jump) ; j++) {
                    System.out.print(j+" ");
                }
            } else {
                for (int j = i; j <= n; j++) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
