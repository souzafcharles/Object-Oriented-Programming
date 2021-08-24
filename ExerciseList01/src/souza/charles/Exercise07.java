package souza.charles;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X, V1, V2, A;

        X = scanner.nextDouble();
        V1 = scanner.nextDouble();
        V2 = scanner.nextDouble();
        A = scanner.nextDouble();

        if (A <= X) {
            System.out.printf("%.2f", A * V1);
        } else {
            System.out.printf("%.2f", A * V2);
        }
    }
}
