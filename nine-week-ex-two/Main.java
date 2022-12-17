import java.util.*;

public class Main 
{
    public static void main (String args[])
    {
        LinkedList<Professor> list = new LinkedList<Professor>();
        Professor p1 = new Professor("John", 123);
        Professor p2 = new Professor("Mary", 456);
        Professor p3 = new Professor("Peter", 789);
        Professor p4 = new Professor("Carlos", 789);
        Professor p5 = new Professor("Paul", 789);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        // Print the list before removing
        for (Professor p : list)
        {
            System.out.println(p.getName() + " " + p.getRegistrationNumber());
        }

        System.out.println("--------------------");

        // Search for a professor by name
        int registrationNumber = 789;
        for (Professor p : list)
        {
            if (p.getRegistrationNumber() == registrationNumber)
            {
                System.out.println("Professor " + p.getName() + " found!");
                break;
            }
        }

        // Removes a professor by registration number
        for (Professor p : list)
        {
            if (p.getRegistrationNumber() == registrationNumber)
            {
                list.remove(p);
                break;
            }
        }

        // Print the list
        for (Professor p : list)
        {
            System.out.println(p.getName() + " " + p.getRegistrationNumber());
        }
    }    
}
