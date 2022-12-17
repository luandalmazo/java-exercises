public class Professor
{
    private String name;
    private int registrationNumber;

    public Professor(String name, int registrationNumber)
    {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getRegistrationNumber()
    {
        return registrationNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRegistrationNumber(int registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }
    
}