package Excercises;

import java.util.Scanner;

public class TestScores {

    public static void main(String[] args){

        int numberOfEntries = 0;
        int high = 0;
        int low = 100;
        int avg = 0;
        int scoreTotal = 0;

        int userEntry = 0;

        Scanner input = new Scanner(System.in);

        while(userEntry != 999){
            System.out.println("Please enter a test score >>>");
            userEntry = input.nextInt();

            if(userEntry > high && userEntry <= 100){
                high = userEntry;
                scoreTotal = scoreTotal + userEntry;
                ++numberOfEntries;
            }
            else if(userEntry < low && userEntry >=0){
                low = userEntry;
                scoreTotal = scoreTotal + userEntry;
                ++numberOfEntries;
            }
            else if(userEntry <= high && userEntry >= low){
                scoreTotal = scoreTotal + userEntry;
                ++numberOfEntries;
            }

            else
                System.out.println("Error");

            avg = scoreTotal / numberOfEntries;
        }

        System.out.println("\n Highest Score " + high + "\n Average Score " + avg + "\n Lowest Score " + low );

    }
}
