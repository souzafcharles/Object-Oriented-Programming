package souza.charles;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner radarSpeed = new Scanner(System.in);
        double M, A, R;
        int L, V;
        L = radarSpeed.nextInt();
        M = radarSpeed.nextFloat();
        A = radarSpeed.nextFloat();
        V = radarSpeed.nextInt();

        if (L < V) {
            R = (M + ((V - L) * A));
            System.out.printf("%.2f", R);
        } else {
            System.out.println("0.00");
        }
    }
}
