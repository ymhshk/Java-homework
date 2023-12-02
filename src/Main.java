import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int myInt = 20398290; //type variableName = value;
//        short myShort = 32500;
//        byte myByte = 120;
//        long myLong = 94387392;
//        float myFloat = 9.9999f;
//        double myDouble = 35.56;
//        boolean myBoolean = true;
//        char myChar = 'q';
//
//        {
//            System.out.println(myInt + myByte);
//            System.out.println(myLong - myFloat);
//            System.out.println(myByte * myDouble);
//            System.out.println(myLong / myShort);
//            System.out.println(myInt % myShort);
//        }
//        long result1 = myInt + myByte;
//    }
//
//    public void thirdTask() {
//        int anotherInt = 400;
//        short anotherShort = 850;
//        int result2 = anotherShort - anotherInt;
//    }
//
//    public void thirdTask2() {
//        byte anotherByte = 39;
//        long anotherLong = 666888;
//        long result3 = anotherLong / anotherByte;
//    }
        public static void scanner(){
            Scanner reader = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number % 2 == 0)
                System.out.println(number + "even");
            else System.out.println(number + "odd");

        }

    }