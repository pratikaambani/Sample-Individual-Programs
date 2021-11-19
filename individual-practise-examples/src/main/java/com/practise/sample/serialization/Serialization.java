package com.practise.sample.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Pratik";
        person.age = 24;
        person.roll = 10;

        try (FileOutputStream fileOutputStream = new FileOutputStream("FileinputStream.txt")) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);

            System.out.println("Look serialVersionUID in Person Class");
            System.out.printf("Great !! ");
            System.out.println("Serialized data saved in FileinputStream.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
