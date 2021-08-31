package souza.charles;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner interspersed = new Scanner(System.in);

        int arraySize;
        int arrayIndex;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        arraySize = interspersed.nextInt();
        int[] arrayA = new int[arraySize];
        int[] arrayB = new int[arraySize];
        int[] arrayC = new int[arraySize * 2];

        while (i < arraySize) {
            arrayA[i] = interspersed .nextInt();
            i++;
        }

        while (j < arraySize) {
            arrayB[j] = interspersed .nextInt();
            j++;
        }

        arrayIndex = -1;
        while (k < arrayA.length) {
            arrayC[++arrayIndex] = arrayA[k];
            arrayC[++arrayIndex] = arrayB[k];
            k++;
        }

        while (l < arrayC.length) {
            System.out.printf("%d ", arrayC[l]);
            l++;
        }
    }
}
