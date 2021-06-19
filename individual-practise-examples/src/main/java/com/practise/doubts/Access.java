package com.java7;

class Access {
    static int x = 11;
    private int y = 33;

    public static void main(String[] args) {
        com.java7.Access t = new com.java7.Access();
        t.method1(5);
    }

    public void method1(int x) {
        com.java7.Access t = new com.java7.Access();
        com.java7.Access.x = 22;
        y = 44;

        System.out.println("Test.x: " + com.java7.Access.x);
        System.out.println("t.x: " + com.java7.Access.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

}