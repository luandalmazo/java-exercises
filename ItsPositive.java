import java.util.Scanner;

public class ItsPositive 
{
    public static void main(String args[])
    {
        int num =0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* Check if a number is positive or negative */
        if (num >0)
            System.out.println("Positive");
        else
        System.out.println("Negative");

        input.close();

    }    
}
