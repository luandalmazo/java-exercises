import java.util.Scanner;

public class Replace 
{
    public static void main(String args[]) 
    {
        String word_01;
        String word_02;
        String new_word01;
        String new_word02;

        Scanner input = new Scanner (System.in);
        word_01 = input.nextLine();
        word_02 = input.nextLine();

        int i=0;
        new_word01 = word_01.replace('a', '*');
        new_word02 = word_02.replace('a', '*');
        int tam = new_word01.length();

        for (i = tam-1; i>=0; i--)
        {
            System.out.print(new_word01.charAt(i));
        }

        System.out.println("");
        tam = new_word02.length();
        for (i=tam-1; i>=0; i--)
        {
            System.out.print(new_word02.charAt(i));
        }

        System.out.println("");
        input.close();
    }    
}
