package com.sample.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */
public class TryWith {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("FileinputStream.txt"))){
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
