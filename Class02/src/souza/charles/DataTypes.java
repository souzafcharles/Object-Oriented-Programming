package souza.charles;

import java.util.Scanner;

public class DataTypes {

    static int outsideScope;

    enum gender {MASCULINO, FEMININO, NAO_DECLARADO};

    public static void main (String[] args){
        int i;
        int j = 10;
        i = 10;
        j = 11;

        double d = i;
        System.out.println("d = " + d);
        d = 1.56;

        int x = (int) d;
        System.out.println("x = " + x);
        System.out.println(outsideScope);

        char c = 'p';
        System.out.println(c);

        float f = 1f;
        System.out.println("f = " + f);
        f = f/3;
        f = f*3;
        System.out.println("f = " + f);
        final int constant = 10;

        gender myGender = gender.MASCULINO;
        System.out.println("My Gender = " + myGender);

        int value = 99;
        System.out.println(value++);
        System.out.println(--value);

        value = - value; //
        System.out.println("Value = " + value);
        System.out.println(!!true);

        double sum = 10 + 10.99;
        System.out.println("Sum = " + sum);

        float division = 10/ 3f;
        System.out.println("Division = " + division);

        int number = 10;
        number +=10;
        System.out.println("Number = " + number);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(name+ " You can drink corote.");
        } else  {
            System.out.println(name + " only drink milk!");
        }
        System.out.println(age >=18 ? name + " You can drink corote " : name + " only drink milk!");

        Scanner input = new Scanner(System.in);
        int valueInput = input.nextInt();
        int otherValue = 0;

        switch (valueInput) {
            case 1:
                otherValue =1;
                break;
            case 2:
                otherValue =2;
                break;
            case 3:
                otherValue =3;
                break;
            case 4:
                otherValue =4;
                break;
            default:
                otherValue = -1;
        }
        System.out.println("Other Value = " + otherValue );
    }
}
