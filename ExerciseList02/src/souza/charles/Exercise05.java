package souza.charles;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner cake = new Scanner(System.in);

        int age;
        int candle;
        int biggestCandle = 0;
        int amountOfTallCandles = 0;
        int counterHeightCandle = 0;
        int counterAmountOfTallCandles = 0;

        age = cake.nextInt();
        int[] heightCandle = new int[age];

        while (counterHeightCandle < age) {
            heightCandle[counterHeightCandle] = cake.nextInt();

            counterHeightCandle++;
        }

        while (counterAmountOfTallCandles < heightCandle.length) {
            candle = heightCandle[counterAmountOfTallCandles];
            if (candle == biggestCandle) {
                amountOfTallCandles++;
            }
            if (candle > biggestCandle) {
                biggestCandle = candle;
                amountOfTallCandles = 1;
            }
            counterAmountOfTallCandles++;
        }
        System.out.println(amountOfTallCandles);
    }
}
