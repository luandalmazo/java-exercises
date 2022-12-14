public class CartaoNatal extends CartaoWeb
{
    // -- Constructor
    CartaoNatal(String destinario)
    {
        super(destinario);
    }

    // -- Methods
    void retornarMensagem(String remetente)
    {
        System.out.println("Feliz Natal " + destinario + "!");
        System.out.println("De: " + remetente);
    }
}
