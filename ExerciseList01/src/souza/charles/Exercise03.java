package souza.charles;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){
        Scanner leapYear = new Scanner(System.in);
        int date;

        date = leapYear.nextInt();

        if (date <= 0) {
            System.out.println("Erro");
            return;
        }
        if(date % 400 == 0){
            System.out.println("Ano bissexto");
        } else if((date % 100 != 0) && (date % 4 == 0)){
            System.out.println("Ano bissexto");
        } else{
            System.out.println("Ano nao bissexto");
        }
    }
}
