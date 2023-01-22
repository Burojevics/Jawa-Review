package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        // when we have more conditions to test
        /*

        if (boolean condition) {

        code A;

        }else if (boolean condition) {

        code B;
        }else id (boolean condition) {

        code C;
        }
         */

        /* Check homework

        if you completed more than 25 -> great job
        if you completed more than >20 -> good job
        if you completed more than >10 -> ok job
        if you completed more than >5 -> not good
         */

        int tasks=10;

        if(tasks>=25) {

            System.out.println("Great job");
        }else if(tasks>20) {

            System.out.println("Good job");
        }else if (tasks>=10) {

            System.out.println("Ok job");
        }else if(tasks>5) {

            System.out.println("Not good");

        }

        String browser="opera";

        if(browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser ");
        }else if(browser.equals("Firefox")) {
            System.out.println("Test cases executed on firefox browser");
        }else{
            System.out.println("Browser is not supported");
        }

    }
}
