public class Monitor implements Comparable<Monitor>
{
    private String name;
    private int registry;
    private int class_code;

    public Monitor(String name, int registry, int class_code)
    {
        this.name = name;
        this.registry = registry;
        this.class_code = class_code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRegistry() {
        return registry;
    }
    public void setRegistry(int registry) {
        this.registry = registry;
    }
    public int getClass_code() {
        return class_code;
    }
    public void setClass_code(int class_code) {
        this.class_code = class_code;
    }
    
    public void imprimir()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Registry: "+this.registry);
        System.out.println("Code: "+this.class_code);

    }

    public int compareTo(Monitor m)
    {
        if (this.name == m.name)
        {
            return 0;
        }
        else if (this.name.compareTo(m.name) > 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}