package ConditionalStatements_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        
        DecimalFormat format = new DecimalFormat("0.#");

        String number1 = format.format(a);
        String number2 = format.format(b);

        if (a > b){
            System.out.print(number2+" "+number1);
        } else {
            System.out.print(number1+" "+number2);
        }
    }
}
