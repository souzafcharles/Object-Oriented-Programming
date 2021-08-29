package souza.charles;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner vector = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        for(int i = 0; i < 5; i++) {
            A[i] = vector.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            B[i] = vector.nextInt();
        }

        boolean condition = false;

        for(int i = 0; i < 5; i++) {
            try {
                C[i] = Math.addExact(A[i], B[i]);
            } catch (ArithmeticException e){
                condition = true;
            }
        }

        if(condition) {
            System.out.println("Erro");
        } else {
            System.out.printf("%d, %d, %d, %d, %d", C[0], C[1], C[2], C[3], C[4]);
        }
    }
}
