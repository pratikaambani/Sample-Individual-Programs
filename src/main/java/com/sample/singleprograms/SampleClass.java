package com.sample.singleprograms;

import java.io.File;

public  class SampleClass {

public  static void main(String[] args) {
    final File folder = new File("//Sample/Project//src//");
	listFilesForFolder(folder);
}

public  static void listFilesForFolder(final File folder) {
    for (final File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            listFilesForFolder(fileEntry);
        } else {
            System.out.println(fileEntry.getName());
        }
    }
}



}
