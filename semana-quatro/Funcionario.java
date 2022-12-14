public class Funcionario 
{
    // -- Attributes 
    protected String nome;
    protected int matricula;
    protected boolean isEstrangeiro;

    // -- Constructor
    public Funcionario(String nome, int matricula, boolean isEstrangeiro) 
    {
        this.nome = nome;
        this.matricula = matricula;
        this.isEstrangeiro = isEstrangeiro;
    }

    // -- Methods
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public int getMatricula() 
    {
        return matricula;
    }
    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }
    public boolean isEstrangeiro() 
    {
        return isEstrangeiro;
    }
    public void setEstrangeiro(boolean isEstrangeiro) 
    {
        this.isEstrangeiro = isEstrangeiro;
    }
    public void imprimirDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Estrangeiro: " + this.isEstrangeiro);
    }
    public double calculaSalario()
    {
        return 0.0;
    }

    
}