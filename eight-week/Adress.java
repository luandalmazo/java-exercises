public class Adress 
{
    private String street;
    private String city;
    private String state;
    private String neighborhood;
    private int number;

    public Adress(String street, String city, String state, String neighborhood, int number) 
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.neighborhood = neighborhood;
        this.number = number;
    }

    public String getStreet() 
    {
        return street;
    }

    public void setStreet(String street) 
    {
        this.street = street;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getState() 
    {
        return state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public String getNeighborhood() 
    {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) 
    {
        this.neighborhood = neighborhood;
    }

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    
    
}
