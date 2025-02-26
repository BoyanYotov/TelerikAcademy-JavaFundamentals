package ConditionalStatements_02;

import java.util.Scanner;

public class BeerTime_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.length() < 7 || input.length() > 8) {
            System.out.println("invalid time");
            // If validation fails the program ends its execution
            return;
        }

        String[] parts = input.split(" ");
        String time = parts[0];
        String day = parts[1];
        String[] hoursMinutes = time.split(":");
        String hour = hoursMinutes[0];
        String minutes = hoursMinutes[1];

        int hoursNumber = Integer.parseInt(hour);
        int minutesNumber = Integer.parseInt(minutes);

        if (hoursNumber < 0 || hoursNumber > 12) {
            System.out.println("invalid time");
            return;
        }

        if (minutesNumber < 0 || minutesNumber > 59) {
            System.out.println("invalid time");
            return;
        }

        if (day.equals("PM") && hoursNumber >= 1) {
            System.out.print("beer time");
        } else if (day.equals("AM") && hoursNumber < 3 && minutesNumber < 60) {
            System.out.print("beer time");
        } else if (day.equals("AM") && hoursNumber >= 3) {
            System.out.print("non-beer time");
        } else {
            System.out.println("invalid time");
        }
    }
}
