package souza.charles;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner thermometer = new Scanner(System.in);
        int i, maximum = 0, sum = 0;
        double avarage;

        int[] temperature = new int[7];

        for (i = 0; i < 7; i++) {
            temperature[i] = thermometer.nextInt();
            sum += temperature[i];
        }
        avarage = ((double) sum/ 7);

        for (int j : temperature) {
            if(j > avarage){
                maximum++;
            }
        }
        System.out.println(maximum);
    }
}
