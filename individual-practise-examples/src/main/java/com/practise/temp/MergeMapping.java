package com.practise.temp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MergeMapping {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Pratik", "Ambani"),
                new User("Sonali", "Ambani"),
                new User("Mishti", "Ambani")
        );

//        int sum = (a, b) -> a+b;

        Runnable sss = () -> System.out.println(1);
        sss.run();

        BiFunction<String, Integer, String> bF = (a, b) -> a + (b+2);
        String ssss  = bF.apply("a", 6);
        System.out.println(ssss);


        Function<User, String> userStringFunction = user -> user.getfName() + user.getlName();

        Predicate<String> ss = s -> s.length() == 0;

        users.stream()
                .map(userStringFunction)
                .filter(ss)
                .sorted()
                .forEach(System.out::println);
    }
}



class User {
    private String fName;
    private String lName;

    public User(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}