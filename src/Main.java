import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //first task
        int myInt = 20398290; //type variableName = value;
        short myShort = 32500;
        byte myByte = 120;
        long myLong = 94387392;
        float myFloat = 9.9999f;
        double myDouble = 35.56;
        boolean myBoolean = true;
        char myChar = 'q';

        //second task
        System.out.println(myInt + myByte);
        System.out.println(myLong - myFloat);
        System.out.println(myByte * myDouble);
        System.out.println(myLong / myShort);
        System.out.println(myInt % myShort);

        //third task
        minus();
        divide();
        //fourth task
        scanner();
    }

    public static void minus() {
        int a = 400;
        short b = 850;
        int result = b - a;
        System.out.println(result);
    }

    public static void divide() {
        byte a = 39;
        long b = 666888;
        long result = b / a;
        System.out.println(result);
    }

    public static void scanner(){
        Scanner reader = new Scanner(System.in);
        System.out.println("please provide a number");
        int number = reader.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }

    }