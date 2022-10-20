import java.util.Scanner;

public class Function 
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        /* Calculates the results of the functions */

        /* F(x)  = x*/
        System.out.print("F(a) = "+num);
        System.out.println("\n");

        /* F(x) = 2*x+1 */
        System.out.print("F(b) = "+(num*2+1));
        System.out.println("\n");

        /* F(x) = x-3*/
        System.out.print("F(c) = "+(num-3));
        System.out.println("\n");
        
        input.close();
    }    
}
