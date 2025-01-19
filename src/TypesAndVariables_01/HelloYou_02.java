package TypesAndVariables_01;

import java.util.Scanner;

public class HelloYou_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.printf("Hello, %s!",name);
    }
}
