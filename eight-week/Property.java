public abstract class Property 
{
    protected Adress adress;
    protected double price;
    
    public Property(Adress adress, double price) 
    {
        this.adress = adress;
        this.price = price;
    }
    
    public abstract double calculatePrice();
}