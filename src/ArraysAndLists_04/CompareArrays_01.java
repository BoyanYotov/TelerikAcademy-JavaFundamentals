package ArraysAndLists_04;

import java.util.Scanner;

public class CompareArrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n ; i++) {
            firstArray[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0;i < n ; i++) {
            secondArray[i] = Integer.parseInt(scanner.nextLine());
        }
        boolean areEqual = true;

        for (int i = 0; i < n ; i++) {
            if (firstArray[i] == secondArray[i]){
                    areEqual = true;
            } else {
                areEqual = false;
            }
        }

        if (areEqual){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
