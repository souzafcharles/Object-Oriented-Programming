package souza.charles;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        final int SIZE = 10;
        int countableVariable = 0;
        int indexVariable = 0;
        int temporaryVariable;
        boolean equalFlag = true;
        boolean flagConclusion = false;
        boolean additionalFlag;

        int[] vector = new int[SIZE];

        for (int i = 0; i < SIZE/2 && equalFlag; i++) {
            temporaryVariable = number.nextInt();
            countableVariable++;

            for (int j = 0; j < countableVariable; j++) {
                if(vector[j] == temporaryVariable) {
                    System.out.println("Erro");
                    equalFlag = false;
                }
            }

            vector[i] = temporaryVariable;
        }

        if(equalFlag) {
            for (int i = 0; i < countableVariable; i++) {
                System.out.printf("%d ", vector[i]);
            }

            System.out.println();

            if (!flagConclusion) {
                do {
                    temporaryVariable = number.nextInt();
                    additionalFlag = true;

                    for (int i = 0; i < countableVariable; i++) {
                        if (vector[i] == temporaryVariable) {
                            additionalFlag = false;
                            indexVariable = i;
                            break;
                        }
                    }

                    if (additionalFlag) {
                        vector[countableVariable] = temporaryVariable;
                        countableVariable++;
                    } else {
                        for (int i = indexVariable; i < countableVariable; i++) {
                            vector[i] = vector[i + 1];
                        }
                        countableVariable--;
                    }

                    for (int i = 0; i < countableVariable; i++) {
                        System.out.printf("%d ", vector[i]);
                    }

                    if (countableVariable == 0 || countableVariable == 10) {
                        flagConclusion = true;
                    } else {
                        System.out.println();
                    }
                } while (!flagConclusion);
            }
        }
    }
}
