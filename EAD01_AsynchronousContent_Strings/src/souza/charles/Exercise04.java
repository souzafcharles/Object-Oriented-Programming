package souza.charles;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner anagram = new Scanner(System.in);

        char[] string01;
        char[] string02;
        int index = 0;
        int counter01 = 1;
        int counter02 = 1;
        boolean indicator = true;

        string01 = anagram.nextLine().toCharArray();
        string02 = anagram.nextLine().toCharArray();

        if (string01.length != string02.length) {
            indicator = false;
        } else {
            while (index < string01.length) {
                counter01 *= string01[index];
                counter02 *= string02[index];
                index++;
            }

            if(counter01 != counter02) {
                indicator = false;
            }
        }

        if (!indicator) {
            System.out.println("Nao");
        } else {
            System.out.println("Sim");
        }
    }
}
