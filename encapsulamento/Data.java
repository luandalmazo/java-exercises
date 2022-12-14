public class Data 
{
    // -- Atributos
    private int dia;
    private int mes;
    private int ano;
    
    // -- Getters
    public int getDia() 
    {
        return dia;
    }
    public int getMes() 
    {
        return mes;
    }
    public int getAno() 
    {
        return ano;
    }

    // -- Setters
    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    // -- Construtor
    public Data (byte mes)
    {
        this.mes = mes;
    }

    public Data (int ano)
    {
        this.ano = ano;
    }

    public Data (int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}