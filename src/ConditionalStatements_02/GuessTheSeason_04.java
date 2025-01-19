package ConditionalStatements_02;

import java.util.Scanner;

public class GuessTheSeason_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());

        switch (month){
            case "January":
            case "February":
                System.out.print("Winter");
                break;
            case "April":
            case "May":
                System.out.print("Spring");
                break;
            case "July":
            case "August":
                System.out.print("Autumn");
                break;
            case "October":
            case "November":
                System.out.print("Winter");
                break;
        }

        if (month.equals("March")){
            if (day < 20){
                System.out.print("Winter");
            } else {
                System.out.print("Spring");
            }
        }

        if (month.equals("June")){
            if (day < 21){
                System.out.print("Spring");
            } else {
                System.out.print("Summer");
            }
        }

        if (month.equals("September")){
            if (day < 22){
                System.out.print("Summer");
            } else {
                System.out.print("Autumn");
            }
        }

        if (month.equals("December")){
            if (day < 21){
                System.out.print("Autumn");
            } else {
                System.out.print("Winter");
            }
        }
    }
}
