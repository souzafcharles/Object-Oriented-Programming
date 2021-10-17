package souza.charles;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            boolean result = isEven(input);
            System.out.println("O número digitado é " + (result? "par!" : "ímpar!"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Valor de entrada inválido");
        }
        scanner.close();
    }

    public static boolean isEven(String variable) {
        int number = Integer.parseInt(variable);
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
