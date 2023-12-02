import java.util.Scanner;

public class Main {
    private static Scanner scanner;
//    static int two(int result2){
//        return result2;
//    }
//    static int three(int result3){
//        return result3;
//    } - тут я пробувала запустити методи з мейну (Повторить задание 2, но выполнить его в отдельных методах и запустить эти методы в методе Main)


    public static void main(String[] args) {

        int myInt = 20398290; //type variableName = value;
        short myShort = 32500;
        byte myByte = 120;
        long myLong = 94387392;
        float myFloat = 9.9999f;
        double myDouble = 35.56;
        boolean myBoolean = true;
        char myChar = 'q';

        {
            System.out.println(myInt + myByte);
            System.out.println(myLong - myFloat);
            System.out.println(myByte * myDouble);
            System.out.println(myLong / myShort);
            System.out.println(myInt % myShort);
        }
    }

    public void thirdTask() {
        int anotherInt = 400;
        short anotherShort = 850;
        int result2 = anotherShort - anotherInt;
    }

    public void thirdTask2() {
        byte anotherByte = 39;
        long anotherLong = 666888;
        long result3 = anotherLong / anotherByte;
    }
//        public static void scanner(){
//            Scanner reader = new Scanner(System.in);
//            int number = scanner.nextInt();
//            if (number % 2 == 0)
//                System.out.println(number + "even");
//            else System.out.println(number + "odd");
//
//        } - тут я пробувала виконати завданя С помощью класса Scanner ввести целое число. Далее создайте условие, если это число четное то выведите сообщение "Четное число", если нет то "Не четное число"


    }