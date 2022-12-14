import java.util.Scanner;

public class FindMatrix 
{
    public static void main(String args[]) 
    {
        int matrix[][] = new int[4][4];
        Scanner input = new Scanner(System.in);
        int i=0;
        int j=0;
        int value;
        boolean find = false;

        for(i=0; i<matrix.length; i++)
        {
            for (j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.print("Valor: ");
        value = input.nextInt();

        System.out.println("");
        for(i=0; i<matrix.length; i++)
        {
            for (j=0; j<matrix[i].length; j++)
            {
                if (matrix[i][j] == value)
                    find = true;
            }
        }

        if (find == true)
            System.out.println("Achou");
        else
            System.out.println("Elemento não encontrado");

        input.close();
    }    
}
