import java.util.ArrayList;
import java.util.LinkedList;

public class App 
{
    public static void main( String[] args )
    {
        EletronicProduct prod1 = new Television();
        prod1.setName("TV");
        prod1.setWeight(10.0);

        EletronicProduct prod2 = new Cellphone();
        prod2.setName("Cellphone");
        prod2.setWeight(1.0);


        Service serv1 = new Service();
        serv1.setDuration(10);
        serv1.setFormat("DVD");

        ArrayList<Store> store = new ArrayList<Store>();
        store.add(serv1);
        store.add(prod1);
        store.add(prod2);

        LinkedList<Store> store2 = new LinkedList<Store>();
        store2.add(serv1);
        store2.add(prod1);
        store2.add(prod2);

        for (Store s : store) 
        {
            s.sell();
            s.warranty();
            if (s instanceof EletronicProduct)
            {
                EletronicProduct p = (EletronicProduct) s;
                p.turnOn(p);
                p.turnOff(p);
            }
        }

    }    
}
