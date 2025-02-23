package ArraysAndLists_04;

import java.util.ArrayList;
import java.util.Scanner;

public class NegativePositiveSort_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");
        int[] input = new int[command.length];

        for (int i = 0; i < command.length; i++) { // Fixed index range
            input[i] = Integer.parseInt(command[i]);
        }

        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();

        for (int number : input) { // Simplified loop
            if (number > 0) {
                positives.add(number);  // Fixed method call
            } else {
                negatives.add(number);  // Fixed method call
            }
        }

        for (Integer negative : negatives) {
            System.out.print(negative + " ");
        }

        for (Integer positive : positives) {
            System.out.print(positive + " ");
        }
    }
}
