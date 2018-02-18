package com.sample.practise.exceptions;

/**
 * Created by Pratik Ambani on 29/11/2017.
 */
public class ExceptionExample extends Super {
    public static void main(String[] args) throws Exception {
        Super ss = new ExceptionExample();
        int a = szdas();
        System.out.println(a);

//        System.out.println("");
    }

    private static int szdas() {
        try {
            System.out.println("t");
            ;
            throw new RuntimeException();
            //           return 1;
        } catch (Exception e) {
            System.out.println("c");
//            System.exit(0);
            return 2;
        } finally {
//            System.exit(0);
            System.out.println("f");
            return 3;
        }
    }
}

class Super {

}
