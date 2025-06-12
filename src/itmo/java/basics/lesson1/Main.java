package itmo.java.basics.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        //  var some = true;
//
//        String str = null;
//
//
//        var number = 123L;
//
//        byte b = 111;
//        short s = 123;
//        int i = 500;
//        long l = 5000000000L;
//        float f = 12.3f;
//        double d = 14.5;
//
//        char c = 'a';
//        boolean isTrie = true;
//
////        byte x = (byte)(b + i);
////
////        System.out.println(x);
////
////        int result = i / b;
////        System.out.println(result);
//
//        if (true) {
//            //logic
//        }
//
//        if (true) {
//            //logic
//        } else {
//            //logic
//        }
//
//        if (true) {
//            //logic
//        } else if (false) {
//            //logic
//        } else if (false) {
//            //logic
//        } else if (false) {
//            //logic
//        }
//
//        int x = 11;
//        int y = 20;
//
//        // x == ; x != y; x> y; x <y; x >=y; x<=y; x%2 == 0;
//        if (x %  2 == 0) {
//            System.out.println("Ok!");
//        }
//        if (x %  2 == 0 && x != y) {
//            //logic
//        }
//
//        if (x %  2 == 0 || x != y) {
//            //logic
//        }
//
//        int a = 3;
//
//        int z;
//
//        if(a == 3) {
//            z = 100;
//        } else {
//            z = 50;
//        }
//
//        z = a == 3 ? 100 : 50;
//
////        String s1 = someMethod(20);
//////        someMethod();
////        System.out.println(s1);
////        method(55, null);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int t = scanner.nextInt();

        System.out.println(line);
        System.out.println(t);
    }

    public static String someMethod(int number) {
        switch (number){
            case 10 :
                return "ten";
            case 20 :
                return "twenty";
            default:
                return "illegal number";
        }
    }

    public static void someMethod2(int number) {
        int x;
        switch (number) {
            case 10:
                x = number;
                break;
            case 20:
                x = number + number;
                break;
            default:
                x = 10000;

        }
    }

    public static void method(int number, String str){
        if (str == null){
            return;
        }
        str.length();
    }
}
