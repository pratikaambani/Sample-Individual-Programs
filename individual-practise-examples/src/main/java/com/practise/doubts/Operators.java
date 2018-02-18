package com.practise.doubts;

/**
 * Created by Pratik Ambani on 1/10/2017.
 */
public class Operators {

    public static void main(String[] args) {

        unaryOperators1();
        unaryOperators2();
        unaryOperators3();

        shiftOperators();

        andOperators();

        orOperators();

        ternaryOperators();

        assignmentOperators1();
        assignmentOperators2();
        assignmentOperators3();

    }

    private static void assignmentOperators3() {
        short a = 10;
        short b = 10;
        //a+=b;//a=a+b internally so fine
        //     a = a + b;//Compile time error because 10+10=20 now int
        System.out.println(a);

        a = 10;
        b = 10;
        a = (short) (a + b);//20 which is int now converted to short
        System.out.println(a);
    }

    private static void assignmentOperators2() {
        int a = 10;
        a += 3;//10+3
        System.out.println(a);
        a -= 4;//13-4
        System.out.println(a);
        a *= 2;//9*2
        System.out.println(a);
        a /= 2;//18/2
        System.out.println(a);
    }

    private static void assignmentOperators1() {
        int a = 10;
        int b = 20;
        a += 4;//a=a+4 (a=10+4)
        b -= 4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
    }

    private static void ternaryOperators() {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
    }

    private static void orOperators() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);//true || true = true
        System.out.println(a > b | a < c);//true | true = true
        //|| vs |
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }

    private static void andOperators() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }

    private static void shiftOperators() {
        System.out.println("Left Shift");
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240

        System.out.println("Right Shift");
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2

        System.out.println(">> vs >>>");
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);


    }

    private static void unaryOperators3() {
        System.out.println("Unary Operators3:");
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }

    private static void unaryOperators2() {
        System.out.println("Unary Operators2:");
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
    }

    private static void unaryOperators1() {
        System.out.println("Unary Operators1:");
        int x = 10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
    }


}
