package souza.charles;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        int indexI = 1;
        int indexJ;
        int indexK;
        int indexL;

        Scanner password = new Scanner(System.in);

        String suggestionPassword = password.nextLine();

        if (suggestionPassword.length() <= 1) {
            System.out.println("Invalido");
        } else {
            while (indexI < suggestionPassword.length()) {

                indexJ = 0;
                while (indexJ < indexI) {
                    System.out.print(suggestionPassword.charAt(indexJ));
                    indexJ++;
                }

                System.out.print("*");
                indexI++;
            }

            indexK = suggestionPassword.length() - 1;
            while (indexK > 0) {

                indexL = 0;
                while (indexL < indexK) {
                    System.out.print(suggestionPassword.charAt(indexL));
                    indexL++;
                }

                if (indexK == 1) {
                    indexK--;
                    continue;
                }
                System.out.print("*");
                indexK--;
            }
        }
    }
}
