public class Main 
{
    public static void main (String args[])
    {
        FuncionarioHorista fh1 [] = new FuncionarioHorista[1];
        FuncionarioMensalista fm1 []= new FuncionarioMensalista[1];
        double media_salarial_horista = 0;
        double media_salarial_mensalista = 0;

        for (int i = 0; i < 1; i++)
        {
            fh1[i] = new FuncionarioHorista("Joao", 1, false, 10.0, 160);
            fm1[i] = new FuncionarioMensalista("Maria", 2, true, 1000.0);
            media_salarial_horista += fh1[i].calculaSalario();
            media_salarial_mensalista += fm1[i].calculaSalario();
        }

        media_salarial_horista /= 1;
        media_salarial_mensalista /= 1;

        System.out.println("Media Salarial Horista: " + media_salarial_horista);
        
        // -- Print datas
        System.out.println("Funcionario Horista:");
        System.out.println("Salário: " + fh1[0].calculaSalario());
        fh1[0].imprimirDados();

        System.out.println("---------------");
        System.out.println("Funcionario Mensalista:");
        System.out.println("Salário: " + fm1[0].calculaSalario());
        fm1[0].imprimirDados();
    }    
}
