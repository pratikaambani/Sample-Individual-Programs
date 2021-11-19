package com.practise.sample.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWithEmailValidation {

    public static void main(String[] args) {

        String eMail = "pratikaambani@gmail.com.";

        Pattern pattern = Pattern
                .compile("[a-zA-Z]*[0-9]*@[a-zA-Z]*[\\.][a-zA-Z]*[//.]?[a-zA-Z]*[//.]?[a-zA-Z]*");

        Matcher matcher = pattern.matcher(eMail);

//		Matcher matcher = pattern.matcher(args[0]);

        if (matcher.matches()) {
            System.out.println("email ID is valid.");
        } else {
            System.out.println("Invalid eMail ID.");
        }


    }

}
