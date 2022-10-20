public class MultiplesOfThree 
{
    public static void main (String args[])
    {
        int num =3;
        int sum =0;
        
        /* Sum the first 10 multiples of three */
        for (int i =0; i<=10; i++)
            sum+= num*i;
        
        System.out.println("The sum of the first 10 multiples of 3 is equal to: "+sum);
    }    
}
