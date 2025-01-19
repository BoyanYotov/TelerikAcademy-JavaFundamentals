package ConditionalStatements_02;

import java.util.Scanner;

public class CheckForPlayCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.print("yes");
                break;
            default:
                System.out.print("no");
         }
    }
}
