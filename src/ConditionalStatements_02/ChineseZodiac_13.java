package ConditionalStatements_02;

import java.util.Scanner;

public class ChineseZodiac_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());

        if (year % 12 == 8) {
            System.out.print("Dragon");
        }
        if (year % 12 == 9) {
            System.out.print("Snake");
        }
        if (year % 12 == 10) {
            System.out.print("Horse");
        }
        if (year % 12 == 11) {
            System.out.print("Sheep");
        }
        if (year % 12 == 0) {
            System.out.print("Monkey");
        }
        if (year % 12 == 1) {
            System.out.print("Rooster");
        }
        if (year % 12 == 2) {
            System.out.print("Dog");
        }
        if (year % 12 == 3) {
            System.out.print("Pig");
        }
        if (year % 12 == 4) {
            System.out.print("Rat");
        }
        if (year % 12 == 5) {
            System.out.print("Ox");
        }
        if (year % 12 == 6) {
            System.out.print("Tiger");
        }
        if (year % 12 == 7) {
            System.out.print("Hare");
        }
    }
}
