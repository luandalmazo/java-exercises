import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) 
    {
        CartaoWeb[] cartao = new CartaoWeb[3];
        String nomes[] = new String [3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            System.out.print("Digite o nome do destinatario: ");   
            nomes[i] = input.nextLine();
            System.out.println("");
        }

        cartao[0] = new CartaoDiaDosNamorados(nomes[0]);
        cartao[1] = new CartaoNatal(nomes[1]);
        cartao[2] = new CartaoAniversario(nomes[2]);

        for (int i = 0; i < cartao.length; i++) 
        {
            cartao[i].retornarMensagem("Pedro");
        }

        input.close();
    }    
}
