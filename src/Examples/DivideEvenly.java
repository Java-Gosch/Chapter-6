package Examples;

public class DivideEvenly {
    public static void main(String[] args)
    {
        int count = 0;

        while(count < 10){
            if(count % 2 == 1)
            System.out.println(count);
            count++;
        }
        while(count > 0){
            if(count % 2 == 0)
            System.out.println(count);
            count--;
        }
        do {
            if(count % 2 == 0)
                System.out.println(count);
            count++;
        }while(count<10);

    }
}
