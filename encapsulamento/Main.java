import java.util.Scanner;

public class Main 
{
    public static void main(String args[]) 
    {
        FolhaDePagamentoUFPR folha[] = new FolhaDePagamentoUFPR[3]; 
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<2; i++)
        {
            folha[i] = new FolhaDePagamentoUFPR();
            
            System.out.println("Digite o nome do funcionário: ");
            String nome = input.nextLine();
            System.out.println("Digite a matrícula do funcionário: ");
            String matricula = input.nextLine();
            System.out.println("Digite o dia de nascimento do funcionário: ");
            int dia = input.nextInt();
            System.out.println("Digite o mês de nascimento do funcionário: ");
            int mes = input.nextInt();
            System.out.println("Digite o ano de nascimento do funcionário: ");
            int ano = input.nextInt();
            System.out.println("Digite o cargo do funcionário: ");
            String cargo = input.next();
            System.out.println("Digite o mês de pagamento: ");
            int mesPagamento = input.nextInt();
            System.out.println("Digite o ano de pagamento: ");
            int anoPagamento = input.nextInt();
            
            folha[i].setFuncionario(new FuncionarioUFPR(nome, matricula, new Data(dia, mes, ano), cargo));
            folha[i].setMesPagamento(new Data((byte)mesPagamento));
            folha[i].setAnoPagamento(new Data(anoPagamento));
            
            input.nextLine();
        }

        for (int i=0; i<2; i++)
        {
            folha[i].imprimir();
            System.out.println("========");
        }
        input.close();
    }
}