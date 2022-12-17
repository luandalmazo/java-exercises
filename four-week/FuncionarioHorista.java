public class FuncionarioHorista extends Funcionario
{
    // -- Attributes
    private double salario_hora;
    private int horas_trabalhadas;

    // -- Constructor
    public FuncionarioHorista(String nome, int matricula, boolean isEstrangeiro, double salario_hora, int horas_trabalhadas) 
    {
        super(nome, matricula, isEstrangeiro);
        this.salario_hora = salario_hora;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public FuncionarioHorista()
    {
        super("", 0, false);
        this.salario_hora = 0;
        this.horas_trabalhadas = 0;
    }

    public FuncionarioHorista(double salario_hora, int horas_trabalhadas)
    {
        super("", 0, false);
        this.salario_hora = salario_hora;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    // -- Methods
    public double getSalario_hora() 
    {
        return salario_hora;
    }
    public void setSalario_hora(double salario_hora) 
    {
        this.salario_hora = salario_hora;
    }
    public int getHoras_trabalhadas() 
    {
        return horas_trabalhadas;
    }
    public void setHoras_trabalhadas(int horas_trabalhadas) 
    {
        this.horas_trabalhadas = horas_trabalhadas;
    }
    public void imprimirDados()
    {
        super.imprimirDados();
        System.out.println("Salario Hora: " + this.salario_hora);
        System.out.println("Horas Trabalhadas: " + this.horas_trabalhadas);
    }
    @Override
    public double calculaSalario()
    {
        return this.salario_hora * this.horas_trabalhadas;
    }
}   
