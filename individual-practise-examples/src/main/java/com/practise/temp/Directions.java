package com.practise.temp;

import java.util.Stack;

public class Directions {
    public static void main(String[] args) {
        String[] directions = new String[]{"S", "E", "W", "N"};
        Stack<String> newDirections = new Stack<>();

        //TODO: [ "SOUTH", "EAST", "WEST", "NORTH" ] can be reduced to []

        for (int a = 0; a < directions.length-1; a++) {
            if ((directions[a].equals("W") && newDirections.peek().equals("E"))) {
                newDirections.pop();
            } else if ((directions[a].equals("W") && newDirections.peek().equals("E"))) {

            }
        }


    }
}
