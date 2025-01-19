package ConditionalStatements_02;

import java.util.Scanner;

public class CalculateChange_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        double paid = Double.parseDouble(scanner.nextLine());
        double change = (paid - price) * 100;
        int levs = 0;

        if (change >= 100){
            levs = (int) change / 100;
            System.out.printf("%d x 1 lev%n",levs);
            change -= levs * 100;
        }
        if (change >= 50){
            System.out.println("1 x 50 stotinki");
            change -= 50;
        }
        if (change >= 40){
            System.out.println("2 x 20 stotinki");
            change -= 40;
        }
        if (change >= 20){
            System.out.println("1 x 20 stotinki");
            change -= 20;
        }
        if (change >= 10){
            System.out.println("1 x 10 stotinki");
            change -= 10;
        }
        if (change >= 5){
            System.out.println("1 x 5 stotinki");
            change -= 5;
        }
        if (change >= 4){
            System.out.println("2 x 2 stotinki");
            change -= 4;
        }
        if (change >= 2){
            System.out.println("1 x 2 stotinki");
            change -= 2;
        }
        if (change >= 1){
            System.out.println("1 x 1 stotinka");
        }
    }
}
