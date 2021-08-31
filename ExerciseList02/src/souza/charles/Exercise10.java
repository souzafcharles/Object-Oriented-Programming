package souza.charles;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);

        int robotInXPosition;
        int robotInYPosition;
        int robotInXPositionResult;
        int robotInYPositionResult;
        int angle;
        int lightBeam;
        int distance;
        int direction;

        robotInXPosition = robot.nextInt();
        robotInYPosition = robot.nextInt();
        angle = robot.nextInt();
        lightBeam = -(robot.nextInt() - 90);
        distance = robot.nextInt();
        direction = (angle + lightBeam) % 360;

        if(direction < 0) {
            direction += 360;
        }

        robotInXPositionResult = (int) Math.round(distance * Math.cos(Math.toRadians(direction)) + robotInXPosition);
        robotInYPositionResult = (int) Math.round(distance * Math.sin(Math.toRadians(direction)) + robotInYPosition);

        if(distance < 0) {
            System.out.println("Erro");
        } else {
            System.out.println("(" + robotInXPositionResult + "," + robotInYPositionResult + ")");
        }
    }
}

