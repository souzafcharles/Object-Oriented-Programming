package souza.charles;
/*
Class title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: August 09, 2021
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Debugging {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        List<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter students (or ENTER to exit):");

        do {
            newStudent = in.nextLine();
            if (!newStudent.equals(""))
                students.add(newStudent);
        } while (!newStudent.equals(""));

        for (String s : students) {
            System.out.print("Student's Grades " + s + ": ");
            grades.add(in.nextDouble());
        }

        System.out.println("Class Grades: ");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i); // Syntax error example: sum = grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Class average = " + avg);
    }
}