package souza.charles;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner paint = new Scanner(System.in);

        double L, A, C, M, Q, T;

        L = paint.nextDouble();
        A = paint.nextDouble();
        C = paint.nextDouble();
        M = paint.nextDouble();

        Q = Math.ceil((L * (A/M)));
        T = (Q * C);
        System.out.printf("%.0f\n",Q);
        System.out.printf("%.2f",T);
    }
}
