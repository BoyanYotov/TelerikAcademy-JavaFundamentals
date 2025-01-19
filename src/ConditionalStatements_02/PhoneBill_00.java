package ConditionalStatements_02;

import java.util.Scanner;

public class PhoneBill_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messages = Integer.parseInt(scanner.nextLine());
        double minutes = Double.parseDouble(scanner.nextLine());

        double addtionalMessages = 0;
        double additionalMinutes = 0;

        if (messages > 20){
            addtionalMessages = messages - 20;
        } else {
            addtionalMessages = 0;
        }

        if (minutes > 60){
            additionalMinutes = (minutes - 60);
        } else {
            additionalMinutes = 0;
        }

        double additionalMessagesTax = addtionalMessages * 0.06;
        double addtionalMinutesTax = additionalMinutes * 0.10;
        double additionalTax = (additionalMessagesTax + addtionalMinutesTax) * 0.2;
        double total = 12 + addtionalMinutesTax + additionalMessagesTax + additionalTax;

        System.out.printf("%.0f additional messages for %.2f levas%n",addtionalMessages,additionalMessagesTax);
        System.out.printf("%.0f additional minutes for %.2f levas%n",additionalMinutes,addtionalMinutesTax);
        System.out.printf("%.2f additional taxes%n",additionalTax);
        System.out.printf("%.2f total bill",total);
    }
}
