package Excercises;

public class CountByThrees {
    public static void main(String[] args) {


        int count = 0;

        while (count < 300) {
            if (count % 3 == 0)
                System.out.println(count);
            count++;
        }

    }
}