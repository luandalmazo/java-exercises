public class Eletronic 
{
    double price;
    String name;
    String brand;
    String model;
    String type;

    public Eletronic(double price, String name, String brand, String model, String type) 
    {
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public Eletronic(double price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public Eletronic(double price, String name, String brand)
    {
        this.price = price;
        this.name = name;
        this.brand = brand;
    }

    public Eletronic(double price, String name, String brand, String model)
    {
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.model = model;
    }

    public Eletronic(String name)
    {
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
    }
}
