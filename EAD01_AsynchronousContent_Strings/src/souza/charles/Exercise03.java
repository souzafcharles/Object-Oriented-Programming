package souza.charles;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        int index =0;
        boolean indicator = true;

        Scanner palindrome = new Scanner(System.in);

        String palindromeCheck = palindrome.nextLine();

        while (index < palindromeCheck.length()) {
            if ((palindromeCheck.charAt(palindromeCheck.length() - index - 1)) == palindromeCheck.charAt(index)) {
                index++;
            } else {
                indicator = false;
                break;
            }
        }

        if (!indicator) {
            System.out.println("Nao");
        } else {
            System.out.println("Sim");
        }
    }
}
