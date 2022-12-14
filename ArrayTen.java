import java.util.Scanner;

public class ArrayTen 
{
    public static void main (String args [])
    {
        Scanner input = new Scanner (System.in);
        int[] num = new int[10];
        int sum_even=0;
        int qtd_odd=0;

        for (int i = 0; i < 10; i++)
            num[i] = input.nextInt();

        for (int i =0; i<10; i++)
        {
            if (num[i] % 2 ==0)
            {
                System.out.println(num[i]);
                sum_even+=num[i];
            } else
            {
                System.out.println(num[i]);
                qtd_odd+=1;
            }
        }

        System.out.println("===============");
        System.out.println("Sum even: "+sum_even);
        System.out.println("Qtd odd: "+qtd_odd);
        input.close();
                
    }


}
