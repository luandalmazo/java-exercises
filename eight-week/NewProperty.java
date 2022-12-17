public class NewProperty extends Property
{
    public NewProperty(Adress adress, double price) 
    {
        super(adress, price);
    }

    public double calculatePrice()
    {
        return this.price * 1.2;
    }

}
