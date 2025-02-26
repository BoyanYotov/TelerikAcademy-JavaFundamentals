package ConditionalStatements_02;

import java.util.Scanner;

public class ChessSquareColor_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String labels = scanner.nextLine();
        int ranks = Integer.parseInt(scanner.nextLine());

        boolean isEven = (ranks % 2 == 0);
        boolean isACDEG = true;

        switch (labels) {
            case "a":
            case "c":
            case "e":
            case "g":
                break;
            default:
                isACDEG = false;
        }

        if (isACDEG && isEven) {
            System.out.print("light");
        } else if (isACDEG && !isEven) {
            System.out.print("dark");
        } else if (!isACDEG && !isEven) {
            System.out.print("light");
        } else if (!isACDEG && isEven) {
            System.out.print("dark");
        }

    }
}
