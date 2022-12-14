abstract class CartaoWeb
{
    // -- Attributes
    protected String destinario;

    // -- Constructor
    CartaoWeb(String destinario)
    {
        this.destinario = destinario;
    }
    
    // -- Methods
    abstract void retornarMensagem(String remetente);
}