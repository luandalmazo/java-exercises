public class CartaoAniversario extends CartaoWeb 
{
    // -- Constructor
    CartaoAniversario(String destinario)
    {
        super(destinario);
    }

    // -- Methods
    void retornarMensagem(String remetente)
    {
        System.out.println("Feliz Aniversario " + destinario + "!");
        System.out.println("De: " + remetente);
    }

}
