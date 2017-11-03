package com.unique;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Created by Pratik Ambani on 3/11/2017.
 */
public class InstanceOfClass {
    public static void main(String[] args) {

        //1
        InstanceOfClass firstInstance = new InstanceOfClass();

        //2
        try {
            InstanceOfClass secondInstance = (InstanceOfClass) Class.forName(String.valueOf(InstanceOfClass.class)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //3
        try {
            InstanceOfClass thirdInstance = (InstanceOfClass) firstInstance.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //4
        try {
            ObjectInputStream stream = new ObjectInputStream(new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            });
            try {
                InstanceOfClass fourthInstance = (InstanceOfClass) stream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
