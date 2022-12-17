public class OldProperty extends Property
{
    public OldProperty(Adress adress, double price) 
    {
        super(adress, price);
    }

    public double calculatePrice()
    {
        return this.price * 0.8;
    }

}
