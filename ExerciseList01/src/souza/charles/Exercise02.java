package souza.charles;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);

        int side_A = triangle.nextInt();
        int side_B = triangle.nextInt();
        int side_C = triangle.nextInt();

        if (side_A <= 0 || side_B <= 0 || side_C <= 0) {
            System.out.println("Erro");
        } else if (side_A + side_B <= side_C || side_A + side_C <= side_C || side_B + side_C <= side_A) {
            System.out.println("Nao forma triangulo");
        } else if (side_A == side_B || side_B == side_C|| side_A == side_C) {
            if(side_A == side_B && side_B == side_C) {
                System.out.println("Equilatero");
            } else {
                System.out.println("Isosceles");
            }

        } else {
            System.out.println("Escaleno");
        }
    }
}
