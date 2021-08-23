package souza.charles;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner books = new Scanner(System.in);
        int numberOfBooks = books.nextInt();

        if(numberOfBooks <= 0){
            System.out.println("Erro");
            return;
        }else {

            double creterium_A = (0.25 * numberOfBooks) + 7.5;
            double creterium_B = (0.5 * numberOfBooks) + 2.5;

            if(creterium_A < creterium_B){
                System.out.println("Criterio A");
            }else if(creterium_B < creterium_A){
                System.out.println("Criterio B");
            } else {
                System.out.println("Indiferente");
            }
        }
    }
}
