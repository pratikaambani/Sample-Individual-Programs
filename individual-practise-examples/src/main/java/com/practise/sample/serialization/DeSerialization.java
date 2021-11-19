package com.practise.sample.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

    public static void main(String args[]) {


        try (FileInputStream fileInputStream = new FileInputStream("FileinputStream.txt")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) objectInputStream.readObject();

            System.out.println("person=  " + person);
            System.out.println("Now getting values from serialized object file.");
            System.out.println("Name = " + person.name);
            System.out.println("Age = " + person.age);
            System.out.println("Roll = " + person.roll);
            System.out.println("Look Roll is not serialized due to using transient.");

            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
