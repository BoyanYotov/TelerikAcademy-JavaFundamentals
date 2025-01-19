package ConditionalStatements_02;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        boolean isValid = true;

            if (score >= 1 && score <= 3){
                score *= 10;
            } else if (score >= 4 && score <= 6){
                score *= 100;
            } else if (score >= 7 && score <= 9){
                score *= 1000;
            } else {
                System.out.print("invalid score");
                isValid = false;
            }

            if (isValid){
                System.out.print(score);
            }
    }
}
