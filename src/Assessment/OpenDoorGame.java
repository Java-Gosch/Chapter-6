package Assessment;

import java.util.Scanner;

public class OpenDoorGame {
    public static void main(String[] args)
    {
        int doorEntered = 4;


        Scanner input = new Scanner(System.in);
        while (doorEntered >= 4) {
            System.out.println("Pick A Door\n Door 1\n Door 2\n Door 3");
            doorEntered = input.nextInt();
            int randomDoor = (int) (Math.random() * 3 + 1);

            if (randomDoor == 1)
                System.out.println("You won a bunny");
            else if (randomDoor == 2)
                System.out.println("You won a mugger, hand over your wallet");
            else if (randomDoor == 3)
                System.out.println("Go to jail, do not collect $200");
            else
                System.out.println("Invalid door, do you have a brain");
        }

    }
}
