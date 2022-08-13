//write a program that says good morning dorris if time is between 6am- 11am, and good afternoon
// if time is between 12pm to 4pm and good evening if time is between 5pm and 11pm.

import java.util.Scanner;

public class Dorris {
    public static void main(String[] args) {
        // todo list ..
        System.out.println("add time here");
        Scanner userInput = new Scanner(System.in);
        int time =userInput.nextInt();


        if (time >= 6 & time <= 12){
            System.out.println("Good morning Ebele");
        } if (time >=12 & time <= 16) {
            System.out.println( " Good afternoon ");
        }else {
            System.out.println( " Good evening");
        }


    }

}
