package TypesAndVariables_01;

import java.util.Scanner;

public class PrintCompanyInformation_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String address = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String faxNumber = scanner.nextLine();
        String webSite = scanner.nextLine();
        String managerName = scanner.nextLine();
        String managerSurname = scanner.nextLine();
        int managerAge = Integer.parseInt(scanner.nextLine());
        String managerPhone = scanner.nextLine();

        System.out.println(name);
        System.out.printf("Address: %s%n", address);
        System.out.printf("Tel. %s%n", phoneNumber);
        System.out.printf("Fax: %s%n", faxNumber);
        System.out.printf("Web site: %s%n", webSite);
        System.out.printf("Manager: %s %s (age: %d, tel. %s)", managerName, managerSurname, managerAge, managerPhone);

    }
}
