public class FuncionarioMensalista extends Funcionario
{
    // -- Attributes
    protected double salario_mensal;
    
    // -- Constructors
    public FuncionarioMensalista(String nome, int matricula, boolean isEstrangeiro, double salario_mensal) 
    {
        super(nome, matricula, isEstrangeiro);
        this.salario_mensal = salario_mensal;
    }

    public FuncionarioMensalista() 
    {
        super("", 0, false);
        this.salario_mensal = 0;
    }

    public FuncionarioMensalista(double salario_mensal)
    {
        super("", 0, false);
        this.salario_mensal = salario_mensal;
    }

    // -- Methods
    public double getSalario_mensal() 
    {
        return salario_mensal;
    }
    public void setSalario_mensal(double salario_mensal) 
    {
        this.salario_mensal = salario_mensal;
    } 
    public void imprimirDados()
    {
        super.imprimirDados();
        System.out.println("Salario Mensal: " + this.salario_mensal);
    }
    @Override
    public double calculaSalario()
    {
        return this.salario_mensal;
    }
    private boolean recebeVT()
    {
        return true;
    }
}
