package souza.charles;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0, amountOfPeople = 0, toBeOverEighteen = 0, elderly = 0, ageSum = 0;

        while (true) {

            if (age < 0) {
                break;

            } else {
                amountOfPeople++;
                ageSum += age;

                if (age >= 75) {
                    elderly++;
                }
                if (age >= 18) {
                    toBeOverEighteen++;
                }
                age = input.nextInt();
            }
        }

        System.out.printf("%.2f\n", (double) ageSum/amountOfPeople);
        System.out.println(toBeOverEighteen);
        System.out.printf("%.2f%%", ((double)elderly/amountOfPeople)*100);

    }
}

