public class CartaoDiaDosNamorados extends CartaoWeb
{

    // -- Constructor

    CartaoDiaDosNamorados(String destinario)
    {
        super(destinario);
    }

    // -- Methods
    void retornarMensagem(String remetente)
    {
        System.out.println("Feliz Dia dos Namorados " + destinario + "!");
        System.out.println("De: " + remetente);
    }
}
