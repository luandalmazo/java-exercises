import java.util.TreeSet;

public class Main 
{
    public static void main (String args[])
    {
        TreeSet<Monitor> monitor = new TreeSet<Monitor>();
        Monitor monitor_um = new Monitor("Karlos", 1, 1062);
        Monitor monitor_dois = new Monitor("Paulo", 2, 1055);
        Monitor monitor_tres = new Monitor("Almeida", 3, 1055);

        monitor.add(monitor_um);
        monitor.add(monitor_dois);
        monitor.add(monitor_tres);

        for(Monitor p: monitor)
        {
            p.imprimir();
        }


    }    
}
