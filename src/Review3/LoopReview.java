package Review3;

import java.util.Scanner;

public class LoopReview {

    public static void main(String[] args) {

        int a=1;

        while(a<=3) {
            System.out.println("I am while loop");
            a++;
        }

        int b=1;
        do{
            System.out.println("do while");
            b++;
        }while(b>=3);


        Scanner name=new Scanner(System.in);
        String answer;

        do {

            System.out.println("Do you understand Loops in Java");
            answer = name.nextLine();

        }while(answer.equalsIgnoreCase("Yes"));

        System.out.println("Great jobs, let's learn arrays now");







    }

}
