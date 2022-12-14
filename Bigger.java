import java.util.Scanner;

public class Bigger 
{
    public static void main(String args []) 
    {
        Scanner input = new Scanner(System.in);
        double num[] = new double[7];
        double bigger = 0;
        double smallest =0;

        for (int i=0; i<num.length; i++)
        {
            num[i] = input.nextDouble();
            if (i==0)
                smallest = num[i];
            if (num[i] > bigger)
            {
                bigger = num[i];
            } else if(num[i] < smallest)
                smallest = num[i];
    
        }
        System.out.println("Maior: "+bigger);
        System.out.println("Menor: "+smallest);
        input.close();
    }    
}
