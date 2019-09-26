package Excercises;

import java.util.Scanner;

public class TestScores {

    public static void main(String[] args){

        int numberOfEntries = 0;
        int high = 0;
        int low = 100;
        int avg;
        int scoreTotal = 0;

        int userEntry = 0;

        Scanner input = new Scanner(System.in);

        while(userEntry != 999){
            System.out.println("Please enter a test score >>>");
            userEntry = input.nextInt();

            if(userEntry > high && userEntry <= 100){

            }
            else if(userEntry < low && userEntry >=0){

            }
            else
                System.out.println("Error");

            numberOfEntries++;
            scoreTotal = scoreTotal + userEntry;
        }








    }
}
