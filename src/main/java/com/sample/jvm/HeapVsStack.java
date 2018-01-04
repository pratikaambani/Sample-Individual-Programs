package com.sample.jvm;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Pratik Ambani on 1/01/2018.
 */
public class HeapVsStack {
    public static void main(String[] args) { // Line 1
        System.out.println("Resources: Refer to InitialReferenceClasses001/resources/01.png");
        int i=1; // Line 2

        Object obj = new Object(); // Line 3
        HeapVsStack mem = new HeapVsStack(); // Line 4
        mem.foo(obj); // Line 5
    } // Line 9

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
    } // Line 8
}
