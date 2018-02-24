package com.practise.doubts;

/**
 * Created by Pratik Ambani on 19/02/2018.

 */

public class Thread1 implements T1{


    @Override
    public void getInt(int hellooooooooowwwwwwww) {
        System.out.println("gsd");
    }
}


@FunctionalInterface
interface T1 {

    default void getSS() {
        System.out.println("Sout");
    }

    static void getASD() {

    }

    void getInt(int hellooooooooowwwwwwww);
}
