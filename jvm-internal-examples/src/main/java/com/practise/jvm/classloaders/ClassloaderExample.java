package com.practise.jvm.classloaders;

/**
 * Created by Pratik Ambani on 21/10/2017.
 */
public class ClassloaderExample {
    public static void main(String[] args) {

        //Bootstrap
        System.out.println("class loader for HashMap: "
                + java.util.HashMap.class.getClassLoader());
        //Extension
        System.out.println("class loader for DNSNameService: "
                + sun.net.spi.nameservice.dns.DNSNameService.class
                .getClassLoader());
        //System
        System.out.println("class loader for this class: "
                + ClassloaderExample.class.getClassLoader());

        System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());
    }
}
