abstract class EletronicProduct implements Store
{
    private String name;
    private double weight;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }    

    public void turnOn(EletronicProduct p)
    {
        System.out.println("Turning on " + p.getName());
    }
    
    public void turnOff(EletronicProduct p)
    {
        System.out.println("Turning off " + p.getName());
    }
}