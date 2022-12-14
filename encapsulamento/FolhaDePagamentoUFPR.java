public class FolhaDePagamentoUFPR 
{
    // -- Atributos
    FuncionarioUFPR funcionario;
    Data mesPagamento;
    Data anoPagamento;

    // -- Getters
    public FuncionarioUFPR getFuncionario() 
    {
        return funcionario;
    }
    public Data getMesPagamento() 
    {
        return mesPagamento;
    }
    public Data getAnoPagamento() 
    {
        return anoPagamento;
    }
    
    // -- Setters
    public void setFuncionario(FuncionarioUFPR funcionario) 
    {
        this.funcionario = funcionario;
    }
    public void setMesPagamento(Data mesPagamento) 
    {
        this.mesPagamento = mesPagamento;
    }

    public void setAnoPagamento(Data anoPagamento) 
    {
        this.anoPagamento = anoPagamento;
    }
    
    // -- Métodos
    public void imprimir()
    {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento().getDia() + "/" + funcionario.getDataNascimento().getMes() + "/" + funcionario.getDataNascimento().getAno());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Mês de Pagamento: " + mesPagamento.getMes());
        System.out.println("Ano de Pagamento: " + anoPagamento.getAno());
    }
}