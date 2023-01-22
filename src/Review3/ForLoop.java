package Review3;

public class ForLoop {
    public static void main(String[] args) {


        for(int i=2; i<=20; i+=5){


            System.out.println(i);

            if(i==12) {
                System.out.println("i is equal to 12- I am breaking my code");

                break;
            }

                for (int p=1; p<=10; p++){

                    if(p%3==0){
                        System.out.println(p);
                        continue;
                    }
                    System.out.println("Hello");
                }



        }


        







    }
}
