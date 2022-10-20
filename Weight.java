import java.util.Scanner;

public class Weight 
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        float height = 0;
        float weight = 0;
        int count = 0;
        float condition;
        int num = input.nextInt();

        /* Checks, based in a condition, if a person is overweight, if so counts +1 */
        while(num != -1)
        {
            weight = input.nextFloat();
            height = input.nextFloat();
            condition = weight/(height*height);
            System.out.println(condition);
            if(condition>25)
                count+=1;
            
            num = input.nextInt();
        }

        System.out.println("There are a total of "+count+" persons overweight");
        input.close();
    }    
}
