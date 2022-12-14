import java.util.Scanner;

public class SumColumn 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int vector[] = new int[3];
        int i,j =0;
        int sum=0;
        
        for (i=0; i<matrix.length; i++)
        {
            for (j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        for (j=0; j<matrix.length; j++)
        {
            sum = 0;
            for (i=0; i<matrix[j].length; i++)
            {
                sum+= matrix[i][j];
            }
            vector[j] = sum;
        }
        
        for (i=0; i<vector.length; i++)
        {
            System.out.println(vector[i]);
        }
        input.close();
    }    
}
