package souza.charles;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner alphabeticalOrder = new Scanner(System.in);

        String string01 = "";
        String string02 = "";
        String auxiliary = "";
        int substringSize;
        int index = 0;


        String firstAndLast = alphabeticalOrder.nextLine().trim();

        substringSize = alphabeticalOrder.nextInt();


        if (firstAndLast.length() < substringSize) {
            return;
        }
        string01 = firstAndLast.substring(0, substringSize);
        string02 = firstAndLast.substring(0, substringSize);

        while (index < firstAndLast.length() - substringSize + 1) {
            auxiliary = firstAndLast.substring(index, index+substringSize);

            if (auxiliary.compareTo(string01) >= 0) {
            } else {
                string01 = auxiliary;
            }
            if (auxiliary.compareTo(string02) <= 0) {
                index++;
                continue;
            }
            string02 = auxiliary;
            index++;
        }
        System.out.printf("%s %s", string01, string02);
    }
}
