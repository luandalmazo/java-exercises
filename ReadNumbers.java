import java.util.Scanner;

public class ReadNumbers 
{
    public static void main (String args[])
    {
        int num = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        /* Sum all numbers entered while the read is not equal -1 */
        while (num != -1)
        {
            sum = sum + num;
            num = input.nextInt();
        }

        System.out.println("Sum: "+sum);
        input.close();
    }    
}
