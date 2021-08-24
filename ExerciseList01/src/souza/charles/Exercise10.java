package souza.charles;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner ponto = new Scanner(System.in);
        int X1, V1, X2, V2, XA, XB;
        String X;

        X1 = ponto.nextInt();
        V1 = ponto.nextInt();
        X2 = ponto.nextInt();
        V2 = ponto.nextInt();

        XA = X1 + V1;
        XB = X2 + V2;

        if (XA == XB)
        {
            X = "SIM";

        }else{
            X = "NAO";
        }

        System.out.println(X);
    }
}
