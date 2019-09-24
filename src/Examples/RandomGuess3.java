package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice = 999;
        int counter = 0;

        int rand_pick = rand.nextInt(10) + 1;
        while (choice != rand_pick) {

        System.out.println("Enter a number to guess between 1 and 10 >>> ");
        choice = input.nextInt();

        if(choice == rand_pick){
            System.out.println("You were right! Good Stuff...");
        }
        else if(choice > rand_pick){
            System.out.println("Nope it was lower ");

        }
        else
            System.out.println("Nope it was higher ");

        counter ++;



        }
    System.out.println("It took you " + counter + " times");

    }
}
