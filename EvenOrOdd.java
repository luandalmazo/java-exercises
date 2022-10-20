import java.util.Scanner;

public class EvenOrOdd 
{
    public static void main (String args[])
    {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* Check if a number is even or odd */ 
        if (num % 2 ==0)
            System.out.println("It's even");
        else
            System.out.println("It's odd");
        
        input.close();
    }    
}
