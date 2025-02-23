package ArraysAndLists_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineLists_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split(",");
        String [] secondArray = scanner.nextLine().split(",");

        List<Integer> combined = new ArrayList<>();

        for (int i = 0; i <= firstArray.length-1 ; i++) {
            int firstitem = Integer.parseInt(firstArray[i]);
            int secondtitem = Integer.parseInt(secondArray[i]);
            combined.add(firstitem);
            combined.add(secondtitem);
        }

        for (int i = 0; i <= combined.size()-1 ; i++) {
            int item = combined.get(i);
            if (i == combined.size()-1){
                System.out.print(item);
            } else {
                System.out.print(item+",");
            }
        }
    }
}
