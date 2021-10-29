package souza.charles;
/*
Class title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: August 23, 2021
*/

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] ages = new int [3];
        ages[0] = 60;
        ages[1] = 30;
        ages[2] = 36;

        int count = 1;

        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            System.out.println("ages[" + i + "] = " + age);
        }

        String[] names = {"Ophélia", "Belizário", "Balthazar"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("name = " + names[i]);
        }

        for(String s : names)
            System.out.printf("Nome: " + s + "\t \t");

        int[][] values = {{1, 3, 5}, {20, 23, 54, 94}, {45, 98, 102} };
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        label:
        for(int[] i : values)
            for(int j : i)
                if (j == num){
                    System.out.println("Value found: ");
                    break label;
                }

        while (true) {
            System.out.printf("Enter a positive number: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number < 0) continue;
            else if (number % 2 == 0) System.out.println(number + " its even");
            else System.out.println(number + " its odd");
        }
    }
}

