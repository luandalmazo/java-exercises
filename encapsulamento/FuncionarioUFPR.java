public class FuncionarioUFPR 
{
    //-- Atributos
    private String nome;
    private String matricula;
    private Data dataNascimento;
    private String cargo;
    
    // -- Getters
    public String getNome() 
    {
        return nome;
    }

    public String getMatricula() 
    {
        return matricula;
    }

    public Data getDataNascimento() 
    {
        return dataNascimento;
    }

    public String getCargo() 
    {
        return cargo;
    }

    // -- Setters
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public void setDataNascimento(Data dataNascimento) 
    {
        this.dataNascimento = dataNascimento;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }

    // -- Construtor
    public FuncionarioUFPR(String nome, String matricula, Data dataNascimento, String cargo) 
    {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
    }
}
