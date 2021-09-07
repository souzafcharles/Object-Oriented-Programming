package souza.charles;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner brick = new Scanner(System.in);

        int brickHeight;
        int brickWidth;
        int brickLength;
        int windowHeight;
        int windowWidth;
        int windowMeasure;

        brickHeight = brick.nextInt();
        brickWidth = brick.nextInt();
        brickLength = brick.nextInt();
        windowHeight = brick.nextInt();
        windowWidth = brick.nextInt();
        windowMeasure = windowHeight + windowWidth;

        if(windowMeasure > brickWidth + brickLength) {
            System.out.println("S");
        }
        else if (windowMeasure > brickHeight + brickWidth){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
    }
}