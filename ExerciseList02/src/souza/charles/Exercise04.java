package souza.charles;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner lamp = new Scanner(System.in);

        int initialConditionOfLampA;
        int initialConditionOfLampB;
        int finalConditionOfLampA;
        int finalConditionOfLampB;
        int switchesPressed = 0;
        boolean conditional = true;

        initialConditionOfLampA = lamp.nextInt();
        initialConditionOfLampB = lamp.nextInt();
        finalConditionOfLampA = lamp.nextInt();
        finalConditionOfLampB = lamp.nextInt();

        while(true) {
            if (!conditional)
                break;

            if(finalConditionOfLampB != initialConditionOfLampB) {
                switchesPressed++;
                if(initialConditionOfLampA == 1) {
                    initialConditionOfLampA = 0;
                } else {
                    initialConditionOfLampA = 1;
                }
                if(initialConditionOfLampB == 1) {
                    initialConditionOfLampB = 0;
                } else {
                    initialConditionOfLampB = 1;
                }
            }
            if(initialConditionOfLampA != finalConditionOfLampA) {
                switchesPressed ++;
                if(initialConditionOfLampA == 1) {
                    initialConditionOfLampA = 0;
                } else {
                    initialConditionOfLampA = 1;
                }
            }
            if(finalConditionOfLampA == initialConditionOfLampA && finalConditionOfLampB == initialConditionOfLampB) {
                break;
            }
        }
        System.out.println(switchesPressed );
    }
}