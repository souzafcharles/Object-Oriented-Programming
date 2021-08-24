package souza.charles;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner lime = new Scanner(System.in);
        int N, C, I, V = 0;

        N = lime.nextInt();
        C = lime.nextInt();

        I = 0;
        while (I < N) {
            V = V + C;
            C = C - 1;

            if(C == 0 || C > 0 && C == 1){
                C = 1;
            }
            I++;
        }
        System.out.println(V);
    }
}
