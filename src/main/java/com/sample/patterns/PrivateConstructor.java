package com.sample.patterns;

class SingletonClass {

    private static PrivateConstructor pcObject = null;

    private SingletonClass() {
        System.out.println("Cons Ex Constructor.");
    }

    public static PrivateConstructor objCreationMethod() {
        if (pcObject == null) {
            pcObject = (PrivateConstructor) new SingletonClass();
        }
        return pcObject;
    }


    public void display() {
        System.out.println("SingletonClass Example");
    }

    public class PrivateConstructor extends SingletonClass {

        public void main(String[] args) {


            SingletonClass scObject = SingletonClass.objCreationMethod();
            scObject.display();

        }
    }
}
