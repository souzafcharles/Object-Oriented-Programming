package souza.charles;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner chocolateShop = new Scanner(System.in);

        int N = chocolateShop.nextInt();
        int C = chocolateShop.nextInt();
        int M = chocolateShop.nextInt();

        if(M > 1) {
            if (M > (N/C)) {
                System.out.println(N/C);
            } else {
                System.out.println(((N/C)/M) + (N/C));
            }
        }
    }
}
