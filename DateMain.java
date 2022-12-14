import java.util.Scanner;

public class DateMain 
{
    public static void main (String args[])
    {
        Date data_1 = new Date();
        Date data_array[] = new Date[10];
        Scanner input = new Scanner(System.in);

        data_1.insert(29, 10, 2022);
        data_1.print();

        for (int i=0; i<10; i++)
        {
            data_array[i] = new Date();
            data_array[i].insert(input.nextInt(), input.nextInt(), input.nextInt());
        }

        for (int i=0; i<10; i++)
        {
            data_array[i].print();
        }
        input.close();
        
    }    
}
