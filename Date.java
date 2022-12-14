public class Date 
{
    int dia;
    int mes;
    int ano;
    
    void insert(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void print()
    {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
