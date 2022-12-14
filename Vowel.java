import java.io.*;
import java.util.Scanner;

public class Vowel 
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        char consonant;
        String word;
        String new_word;
        int i;
        int qtd_vowel =0;
        word = input.nextLine();
        consonant = input.next().charAt(0);

        for (i=0; i< word.length(); i++)
        {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) =='u')
            {
                qtd_vowel+=1;
            }
        }

        new_word = word.replace('a', consonant);
        System.out.println(qtd_vowel);
        System.out.println(new_word);
        input.close();
    } 
}
