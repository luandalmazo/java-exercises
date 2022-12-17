import java.util.Scanner;

public class Main 
{
    public static void main (String args[])
    {
        Adress adress = new Adress("Rua 1", "São Paulo", "SP", "Vila Mariana", 1);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type the price of the property:");
        double price = input.nextDouble();
        Property property[] = new Property[2];
        property[0] = new OldProperty(adress, price);
        property[1] = new NewProperty(adress, price);


        for (int i = 0; i < property.length; i++)
        {
            System.out.println(property[i].calculatePrice());
        }

        input.close();
    }
    
}
