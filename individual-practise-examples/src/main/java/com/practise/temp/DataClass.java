package com.practise.temp;

public class DataClass {

//    firstValue + secondValue return --> sum

    static Double sonaliMateSarvaloGoto(Double fValue, Double sValue) {
        return fValue+sValue;
    }

    static Double discountPachhiNiCost(Integer potato, Integer tomato, Integer onion) {

        Integer totalCostSum = (potato * 16) + (tomato * 24) + (onion * 40);
        Double postDiscount = totalCostSum * 0.9;
        return postDiscount;
    }

    static Double shoppingCal(Double Sonali, Double Pratik, Double Mishti){

        Double realTimeAvgAmt = ((Sonali+Pratik+Mishti));
        Double remainingAmt = (realTimeAvgAmt - 40000*3);
        return remainingAmt;





    }

    public static void main(String[] args) {

       System.out.println(shoppingCal(6640.0,5930.0,17280.0));

/*
        System.out.println("My name is Pratik");

        Integer champak = 1+2*3+4*5;
        System.out.println(champak);

        String name = "Pratik";
        System.out.println(name);

        String myName = "My Name is sonali Ambani";
        System.out.println(myName);
*/

        Double sonaliNiAge = 30.2;
        System.out.println(sonaliNiAge);

        Double pratikNiAge = 31.5;
        System.out.println(pratikNiAge);

//        sonaliMateSarvaloGoto(sonaliNiAge,pratikNiAge);

        System.out.println(discountPachhiNiCost(10, 20, 30));


/*
        Double ageSum = sonaliNiAge+pratikNiAge;
        System.out.println(ageSum);

        Double avgAge = (sonaliNiAge+pratikNiAge)/2;
        System.out.println(avgAge);
*/

        /*
        Employee pratik = new Employee();
        pratik.name = "Pratik";
        pratik.salary = 1000;
        pratik.experience = 10;
        pratik.nameOfSpouse = "Sonali";
*/


/*
        Employee sonali = new Employee();
        sonali.name = "Sonali";
        sonali.salary = 20000;
        sonali.experience = 5;
        sonali.nameOfSpouse = "Pratik";

        Employee mishti = new Employee();
        mishti.name = "mishti";
        mishti.salary = 20000;
        mishti.experience = 5;
        mishti.nameOfSpouse = "Undecided";
*/



/*
        Employee employee1 = new Employee(); //pratik mate no object chhe
        employee1.name = "Pratik";
*/

/*
        Employee employee2 = new Employee();

        Employee employee3 = new Employee();
*/


    }
}
