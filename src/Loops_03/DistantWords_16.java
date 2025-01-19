package Loops_03;

import java.util.Scanner;

public class DistantWords_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetNumber = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int pointsWord = 0;
        int grandTotal = 0;

        for (int i = 1; i <= n ; i++) {
            pointsWord = 0;
            String word = scanner.nextLine();
            int length = word.length();

            for (int j = 0; j < length ; j++) {
                char letter = word.charAt(j);

                switch (letter){
                    case 'a':
                        points=1;
                        break;
                    case 'b':
                        points=2;
                        break;
                    case 'c':
                        points=3;
                        break;
                    case 'd':
                        points=4;
                        break;
                    case 'e':
                        points=5;
                        break;
                    case 'f':
                        points=6;
                        break;
                    case 'g':
                        points=7;
                        break;
                    case 'h':
                        points=8;
                        break;
                    case 'i':
                        points=9;
                        break;
                    case 'j':
                        points=10;
                        break;
                    case 'k':
                        points=11;
                        break;
                    case 'l':
                        points=12;
                        break;
                    case 'm':
                        points=13;
                        break;
                    case 'n':
                        points=14;
                        break;
                    case 'o':
                        points=15;
                        break;
                    case 'p':
                        points=16;
                        break;
                    case 'q':
                        points=17;
                        break;
                    case 'r':
                        points=18;
                        break;
                    case 's':
                        points=19;
                        break;
                    case 't':
                        points=20;
                        break;
                    case 'u':
                        points=21;
                        break;
                    case 'v':
                        points=22;
                        break;
                    case 'w':
                        points=23;
                        break;
                    case 'x':
                        points=24;
                        break;
                    case 'y':
                        points=25;
                        break;
                    case 'z':
                        points=26;
                        break;
                }
                pointsWord+=points;
            }

            System.out.printf("%s %d%n",word,Math.abs(targetNumber-pointsWord));
            grandTotal += Math.abs(targetNumber - pointsWord);
        }
        System.out.printf("%.2f",grandTotal * 1.0 / n);
    }
}
