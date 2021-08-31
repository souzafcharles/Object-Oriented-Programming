package souza.charles;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        Scanner sleigh = new Scanner(System.in);

        int amountOfGifts;
        int weight;
        int index = 0;
        int leftSideWeight = 0;
        int rightSideWeight = 0;
        amountOfGifts = sleigh.nextInt();
        int[] giftWeights = new int[amountOfGifts];

        while (index < amountOfGifts) {
            weight = sleigh.nextInt();
            if(index%2 == 0) {
                rightSideWeight += weight;
                if((rightSideWeight - leftSideWeight) > 5) {
                    System.out.println("N");
                    return;
                } else {
                    giftWeights[index] = weight;
                }
            } else {
                leftSideWeight += weight;
                if((leftSideWeight - rightSideWeight) > 5) {
                    System.out.println("N");
                    return;
                } else {
                    giftWeights[index] = weight;
                }
            }
            index++;
        }
        System.out.println("S");
    }
}